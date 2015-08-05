/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer Institute for Embedded Systems and
 * Communication Technologies ESK
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file is part of ERNEST.
 *
 * Contributors:
 * Fraunhofer ESK - initial API and implementation
 *******************************************************************************/
package de.fraunhofer.esk.ernest.core.cdt;

import java.util.List;

import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.CSourceEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICFolderDescription;
import org.eclipse.cdt.core.settings.model.ICLanguageSetting;
import org.eclipse.cdt.core.settings.model.ICLanguageSettingEntry;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.ICSettingEntry;
import org.eclipse.cdt.core.settings.model.ICSourceEntry;
import org.eclipse.cdt.core.settings.model.util.CDataUtil;
import org.eclipse.cdt.managedbuilder.core.BuildException;
import org.eclipse.cdt.managedbuilder.core.IConfiguration;
import org.eclipse.cdt.managedbuilder.core.IOption;
import org.eclipse.cdt.managedbuilder.core.ITool;
import org.eclipse.cdt.managedbuilder.core.IToolChain;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.cdt.managedbuilder.internal.core.ToolChain;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.Preferences;

import de.fraunhofer.esk.ernest.core.cdt.preferences.CDTPreferenceConstants;
import de.fraunhofer.esk.ernest.core.cdt.wizards.GenerateSimulationWizard;


/**
 * Is called by {@link GenerateSimulationWizard}. <p>
 * Class to create new CDT-Projects.
 */
@SuppressWarnings("restriction")
public class GenerateSimulationProject implements DefinedConstants, CDTPreferenceConstants
{
	/**
	 * Method to generate new CDT Project.<p>
	 *
	 * If generator was successful returns true
	 *
	 * @param projectName name of the future project
	 * @param projectPath path of the future project
	 * @param progressMonitor
	 * @param progresswork total work of the monitor
	 * @param toolChainName tool chain name for the future project
	 * @return boolean success or canceled
	 */
	public boolean createSimulationProj(final String projectName, final String projectPath, final IProgressMonitor progressMonitor, final int progressWork, final String toolChainName) {
		/* Initialize */
		final Preferences preferences = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);
		final boolean SUCCESS = true;
		final boolean CANCELED = false;
		final boolean isDebugConfig = preferences.getBoolean(CDT_ISDEBUGCONFIG, DEFAULT_ISDEBUGCONFIG);
		final String ernestLibraryPath = preferences.get(CDT_LIBRARY_PATH, DEFAULT_LIBRARY_PATH);
		final String ernestIncludePath = preferences.get(CDT_INCLUDE_PATH, DEFAULT_INCLUDE_PATH);

		/* Get Eclipse Project */		
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot root = workspace.getRoot();

		final IProject projectHandle = root.getProject(projectName);

		progressMonitor.subTask(UI_MONITOR_GENPROJCONFIG);
		progressMonitor.worked((int) (progressWork * 0.4) + 1);
		if (progressMonitor.isCanceled()) {
			return CANCELED;
		}

		/* Create new CDT Project */
		try {
			final IProjectDescription projectDesc = workspace.newProjectDescription(projectHandle.getName());

			/* Set Natures manually */
			String[] natures = new String[2];
			natures[0] = "org.eclipse.cdt.core.cnature";
			natures[1] = "org.eclipse.cdt.core.ccnature";
			projectDesc.setNatureIds(natures);

			/* Create Project in workspace */
			final IProject cdtProj = CCorePlugin.getDefault().createCDTProject(projectDesc, projectHandle, null);
			CCorePlugin.getDefault().convertProjectFromCtoCC(cdtProj, null);


			progressMonitor.worked((int) (progressWork * 0.3) + 1);
			/* Get default description */
			final ICProjectDescriptionManager descriptionManager = CoreModel.getDefault().getProjectDescriptionManager();
			final ICProjectDescription description = descriptionManager.createProjectDescription(cdtProj, true);

			progressMonitor.worked((int) (progressWork * 0.2) + 1);
			if (progressMonitor.isCanceled()) {
				return CANCELED;
			}

			/* Extract library and include files */
//			this.extractLibAndIncFiles(progressMonitor, ernestLibraryPath, ernestIncludePath);

			/* Create new ERNEST DEBUG configuration */
			/* Get debug tool chain */
			IToolChain debugToolChain = null;
			for (IToolChain toolChains : ManagedBuildManager.getExtensionsToolChains(ManagedBuildManager.BUILD_TYPE_PROPERTY_ID, ManagedBuildManager.BUILD_TYPE_PROPERTY_DEBUG)) {
				if (toolChains.getUniqueRealName().equalsIgnoreCase(toolChainName)) {
					debugToolChain=toolChains;
				}
			}
			if (debugToolChain == null) {
				System.err.println("No debug toolChain found!");
				return CANCELED;
			}


			/* Create debug configuration */
			final ManagedProject managedProj = new ManagedProject(description);
			final Configuration configurationDebug = new Configuration(managedProj, (ToolChain) debugToolChain, "de.fraunhofer.esk.ernest.debugConfiguration", "ERNEST_Debug");
			configurationDebug.setBuildArtefactType(ManagedBuildManager.BUILD_ARTEFACT_TYPE_PROPERTY_EXE);
			configurationDebug.setArtifactExtension("exe");
			configurationDebug.setArtifactName("${ProjName}");
			configurationDebug.getBuildProperties().setProperty(ManagedBuildManager.BUILD_TYPE_PROPERTY_ID, ManagedBuildManager.BUILD_TYPE_PROPERTY_DEBUG);
			configurationDebug.propertiesChanged();
			final ICConfigurationDescription debugConfig = description.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, configurationDebug.getConfigurationData() );

			configureTools(projectHandle, configurationDebug);

			/* Create new ERNEST RELEASE configuration */
			/* Get release tool chain */
			IToolChain releaseToolChain = null;
			for (IToolChain toolChains : ManagedBuildManager.getExtensionsToolChains(ManagedBuildManager.BUILD_TYPE_PROPERTY_ID, ManagedBuildManager.BUILD_TYPE_PROPERTY_RELEASE)) {
				if (toolChains.getUniqueRealName().equalsIgnoreCase(toolChainName)) {
					releaseToolChain=toolChains;
				}
			}
			
			if (releaseToolChain == null) {
				System.err.println("No release toolChain found!");
				return CANCELED;
			}

			/* Create release configuration */
			final Configuration configurationRelease = new Configuration(managedProj, (ToolChain) releaseToolChain, "de.fraunhofer.esk.ernest.releaseConfiguration", "ERNEST_Release");
			configurationRelease.setBuildArtefactType(ManagedBuildManager.BUILD_ARTEFACT_TYPE_PROPERTY_EXE);
			configurationRelease.setArtifactExtension("exe");
			configurationRelease.setArtifactName("${ProjName}");
			configurationRelease.getBuildProperties().setProperty(ManagedBuildManager.BUILD_TYPE_PROPERTY_ID, ManagedBuildManager.BUILD_TYPE_PROPERTY_RELEASE);
			configurationRelease.propertiesChanged();
			final ICConfigurationDescription releaseConfig =  description.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, configurationRelease.getConfigurationData());

			configureTools(projectHandle, configurationRelease);

			/*  Add Includes, preprocessor symbols and libraries */ 
			/*  C/C++ General -> Paths and Symbols */
			ICConfigurationDescription[] configDescriptions = description.getConfigurations();
			for (ICConfigurationDescription configDescription : configDescriptions) {
				ICFolderDescription projectRoot = configDescription.getRootFolderDescription();
				ICLanguageSetting[] settings = projectRoot.getLanguageSettings();
				
				for (ICLanguageSetting setting : settings) {
					/* Add includes */
					/*  C/C++ General -> Paths and Symbols -> Includes */
					if (setting.supportsEntryKind(ICSettingEntry.INCLUDE_PATH)) {
						List<ICLanguageSettingEntry> includes = setting.getSettingEntriesList(ICSettingEntry.INCLUDE_PATH);
						includes.add(CDataUtil.createCIncludePathEntry(ernestIncludePath, ICSettingEntry.LOCAL));
						setting.setSettingEntries(ICSettingEntry.INCLUDE_PATH, includes);
					}

					/* Add libraries */
					/*  C/C++ General -> Paths and Symbols -> Libraries */
					if (setting.supportsEntryKind(ICSettingEntry.LIBRARY_FILE)) {
						List<ICLanguageSettingEntry> libraries = setting.getSettingEntriesList(ICSettingEntry.LIBRARY_FILE);
//						libraries.add(CDataUtil.createCLibraryFileEntry("\"\""+ernestLibraryPath + "/ernest.lib"+"\"\"", 0));
						libraries.add(CDataUtil.createCLibraryFileEntry("ernest", 0));
						libraries.add(CDataUtil.createCLibraryFileEntry("bt1", 0));
						libraries.add(CDataUtil.createCLibraryFileEntry("systemc", 0));
						setting.setSettingEntries(ICSettingEntry.LIBRARY_FILE, libraries);
					}
					
					if (setting.supportsEntryKind(ICSettingEntry.LIBRARY_PATH)) {
						List<ICLanguageSettingEntry> librarypath = setting.getSettingEntriesList(ICSettingEntry.LIBRARY_PATH);
						librarypath.add(CDataUtil.createCLibraryPathEntry(ernestLibraryPath, ICSettingEntry.LOCAL));
						setting.setSettingEntries(ICSettingEntry.LIBRARY_PATH, librarypath);
					}
					
					if (setting.supportsEntryKind(ICSettingEntry.ALL)) {
						List<ICLanguageSettingEntry> librarypath = setting.getSettingEntriesList(ICSettingEntry.ALL);
						librarypath.add(CDataUtil.createCLibraryPathEntry(ernestLibraryPath, ICSettingEntry.LOCAL));
						setting.setSettingEntries(ICSettingEntry.LIBRARY_PATH, librarypath);
					}
				}
			}


			/* Set Source Folder */
			final ICSourceEntry entrySrc = new CSourceEntry(new Path("/src-gen/"), null, ICSettingEntry.RESOLVED);
			final ICSourceEntry[] sourceEntries = configurationDebug.getSourceEntries();
			final ICSourceEntry[] newSourceEntries = new ICSourceEntry[sourceEntries.length+1];
			System.arraycopy(sourceEntries, 0, newSourceEntries, 0, sourceEntries.length);
			newSourceEntries[sourceEntries.length] = entrySrc;
			configurationDebug.setSourceEntries(newSourceEntries);

			progressMonitor.subTask(UI_MONITOR_GENPROJECT);
			progressMonitor.worked((int) (progressWork * 0.1) + 1);

			if (progressMonitor.isCanceled()) {
				return CANCELED;
			}


			/* Set active configuration DEBUG or RELEASE */
			if (isDebugConfig) {
				description.setActiveConfiguration(debugConfig);
			} else {
				description.setActiveConfiguration(releaseConfig);
			}

			/* Assign description to project */
			descriptionManager.setProjectDescription(cdtProj, description);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

	/**
	 * Sets tool flags in a configuration
	 * 
	 * @param configuration
	 * @throws BuildException
	 */
	private void configureTools(final IProject project, final IConfiguration configuration)
			throws BuildException {
		/*  Set runtime-library to MDd */
		/*  C/C++ Build -> Settings -> C++ Compiler -> Code Generation */
		ITool[] tools = configuration.getToolChain().getTools();
		for (ITool tool : tools) {
			if (tool.getName().contains("C++ Compiler (cl)")) {
				IOption[] options = tool.getOptions();
				for (IOption option : options) {
					if (option.getName().contains("Run-Time Library")) {
						option.setValue("org.eclipse.cdt.msvc.cl.option.runtime.mdd");
					}
				}

				IOption option = tool.getOptionById("org.eclipse.cdt.msvc.cl.option.others");
				if (option != null) {
					String[] compilerFlags = {"/FD", "/RTC1", "/W3", "/nologo", "/TP"};
					ManagedBuildManager.setOption(configuration, tool, option, compilerFlags);
				}
			} 

			if (tool.getName().contains("MinGW C++ Linker")) {
				IOption option = tool.getOptionById("gnu.cpp.link.option.flags");
				String linkerFlags = option.getValue() + " -static-libgcc -static-libstdc++";
				
				ManagedBuildManager.setOption(configuration, tool, option, linkerFlags);
			}
			
			if (tool.getName().contains("GCC C++ Compiler")) {
				IOption option = tool.getOptionById("gnu.cpp.compiler.option.other.other");
				String compilerFlags = option.getValue() + " -Wno-c++0x-compat";

				ManagedBuildManager.setOption(configuration, tool, option, compilerFlags);
			}
		}
		
		ManagedBuildManager.saveBuildInfo(project, true);
	}
}
