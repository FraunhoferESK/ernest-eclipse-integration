package ernest.util;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class TraceReaderFactory {
	public static final String TRACE_READER_ID = "de.fraunhofer.esk.ernest.core.analysismodel.tracereader";
	
	public static IConfigurationElement[] getConfigurationElements() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		return registry.getConfigurationElementsFor(TRACE_READER_ID);
	}
	
	public static String[] getTraceReaders() {
		IConfigurationElement[] config = getConfigurationElements();
		String[] names = new String[config.length];
		for (int i = 0; i < config.length; i++) {
			names[i] = config[i].getAttribute("name");
		}
		
		return names;
	}
	
	public static String getRecorderName(String readerName) {
		IConfigurationElement[] config = getConfigurationElements();
		for (IConfigurationElement e : config) {
			String eName = e.getAttribute("recorder");
			if (readerName.equals(eName)) {
				return eName;
			}
		}
		
		return null;
	}
	
	public static TraceReader createTraceReader(String name) {
		if (name == null)
			name = "BinaryTrace";
		
		IConfigurationElement[] config = getConfigurationElements();
		for (IConfigurationElement e : config) {
			String eName = e.getAttribute("name");
			if (name.equals(eName)) {
				try {
					Object o = e.createExecutableExtension("class");
					if (o instanceof TraceReader) {
						TraceReader reader = (TraceReader) o;
						return reader;
					}
				} catch (CoreException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
		
		return null;
	}
}
