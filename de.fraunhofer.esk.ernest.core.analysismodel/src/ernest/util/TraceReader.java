package ernest.util;

import java.util.Map;
import java.util.SortedSet;

import ernest.architecture.Port;
import ernest.tracing.Trace;

public interface TraceReader {

	void setTrace(Trace trace);

	Map<Port, ? extends SortedSet<Long>> getEvents();
	
}
