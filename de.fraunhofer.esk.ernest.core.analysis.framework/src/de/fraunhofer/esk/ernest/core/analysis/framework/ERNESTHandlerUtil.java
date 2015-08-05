package de.fraunhofer.esk.ernest.core.analysis.framework;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

public final class ERNESTHandlerUtil {
	
	/**
	 * Tries to find an existing ERNEST file from the current selection. Each
	 * selected element is checked, if it is or can be adapted to IFile. If a
	 * file with the same name but ".ernest" as extension exists, this file is
	 * returned.
	 * 
	 * @param selection
	 * @return null or ernest file
	 */
	public static IFile selectionToErnestFile(ISelection selection) {
		return selectionToFile(selection, true, "ernest");
	}
	public static IFile selectionToFile(ISelection selection, boolean replaceExtension, String ... extensions) {
		Collection<IFile> files = selectionToFiles(selection, 1, replaceExtension, extensions);
		
		if (files.size() > 0)
			return files.iterator().next();

		return null;
	}

	public static Collection<IFile> selectionToFiles(ISelection selection, int max, boolean replaceExtension, String ... extensions) {
		LinkedHashSet<IFile> files = new LinkedHashSet<IFile>();
		if (selection instanceof IStructuredSelection) {
			for (Object selectedElement : ((IStructuredSelection)selection).toList()) {
				IFile file = null;
		        if (selectedElement instanceof IFile) {
		        	file = (IFile) selectedElement;
		        }
		        else if (selectedElement instanceof IAdaptable) {
		            file = (IFile)((IAdaptable)selectedElement).getAdapter(IFile.class);
		        }
		        for (String extension : extensions) {
				    if (file != null && !extension.equals(file.getFileExtension())) {
				    	if (replaceExtension) {
				    		file = file.getProject().getFile(file.getProjectRelativePath().removeFileExtension().addFileExtension(extension));
				    	} else {
				    		file = null;
				    	}
				    }
					if (file != null && file.exists()) {
						files.add(file);
						if (files.size() == max)
							break;
					}
		        }
			}
			
		}
		
		return files;
	}
	
	private ERNESTHandlerUtil() {
		// no instances of util class
	}

}
