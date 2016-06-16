package de.fraunhofer.esk.ernest.core.cdt;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.variables.IDynamicVariable;
import org.eclipse.core.variables.IDynamicVariableResolver;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;

import de.fraunhofer.esk.ernest.core.cdt.preferences.CDTPreferenceConstants;

public class DynamicVariableResolver implements IDynamicVariableResolver, CDTPreferenceConstants {
	
	private URI getBasicURI() {
		URI uri = URI.createPlatformPluginURI("/"+ERNEST_INCLUDES_PLUGIN, true);
		URI basicuri = CommonPlugin.resolve(uri); 
		return basicuri;
	}
	
	private String resolveURI(URI uri, String fallback) {
		String fileString = uri.toFileString();
		if (fileString != null) {
			File file = new File(fileString);
			if (file.exists()) {
				try {
					return file.getCanonicalPath();
				} catch (IOException e) {
				}
			}
		}
		
		return fallback;
	}
	
	@Override
	public String resolveValue(IDynamicVariable variable, String argument)
			throws CoreException {
		
		String value = null;
		
		if (ERNEST_INCLUDE_VARIABLE.equals(variable.getName())) {
			URI uri = getBasicURI().appendSegment("include");
			value = resolveURI(uri, FALLBACK_INCLUDE_PATH);
		}
		if (ERNEST_LIBRARY_VARIABLE.equals(variable.getName())) {
			URI uri = getBasicURI().appendSegment("lib");
			value = resolveURI(uri, FALLBACK_LIBRARY_PATH);
		}
		
		if(value == null)
			throw new CoreException(new Status(IStatus.ERROR, ERNEST_INCLUDES_PLUGIN, "Cannot resolve variable: '" + variable.getName() + "'" ));
		
		return value;
	}

}
