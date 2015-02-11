package de.deicon.testing.runner.task;

import org.joda.time.DateTime;

/**
 * Each Test Run creates and runs within its own 
 * Context. Context will be provided by test plugin
 * and may contain connection to external resources like
 * rest endpoints, jdbc connections, etc. 
 * @author dieter
 *
 */
public interface ExecutionContext {
	
	void start(); 
	void finish();
	
	// 
	DateTime getStartTime();
	
	// 
	DateTime getFinishTime();
	
	// save variable for later reference
	void setVariable(String varName, Object value);
	
	// getVariable vom context
	Object getVariable(String varName);
	
}
