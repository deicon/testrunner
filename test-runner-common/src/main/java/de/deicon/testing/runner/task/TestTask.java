package de.deicon.testing.runner.task;

/**
 * Each Test contains of several Tasks. 
 * Tasks will be setup with data, executed and 
 * after execution verified. 
 * 
 * @author dieter
 *
 */
public interface TestTask {
	// provide Task with given Data
	void given(TaskData data);
	
	// execute Task with current execution Context
	Object when(ExecutionContext context);
	
	// called during verification stage of task
	boolean then() throws VerifyException;
	
	// resets status of task, keep task data
	void reset();
	
	void failed(String message);
	void ok(String message);
	
	// returns Status of Task
	TaskStatus getStatus();
	
	TaskData getTaskData();
}
