package de.deicon.testing.runner.lifecycle;

import java.util.Map;

import org.joda.time.DateTime;

import de.deicon.testing.runner.task.ExecutionContext;

public class BaseExecutionContext implements ExecutionContext {
	
	private DateTime startTime;
	
	private DateTime finishTime;
	
	private Map<String, Object> variables;

	public BaseExecutionContext() {
		super();
	}

	public DateTime getStartTime() {
		return startTime;
	}

	public DateTime getFinishTime() {
		return finishTime;
	}

	public void setVariable(String varName, Object value) {
		this.variables.put(varName, value);
	}

	public Object getVariable(String varName) {
		return this.variables.get(varName);
	}

	public void start() {
		this.startTime = new DateTime(); 
	}

	public void finish() {
		this.finishTime = new DateTime();
	}
	
}
