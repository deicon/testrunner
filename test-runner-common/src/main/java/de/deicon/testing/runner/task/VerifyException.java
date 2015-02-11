package de.deicon.testing.runner.task;

/**
 * Verification Failures are indicated using exceptions
 * @author dieter
 *
 */
public class VerifyException extends Exception {

	TestTask task; 
	
	public TestTask getTask() {
		return task;
	}

	public void setTask(TestTask task) {
		this.task = task;
	}

	public VerifyException(TestTask task, String message) {
		super (message);
		this.task = task;
	}
	
	public VerifyException(TestTask task, String message, Throwable th) {
		super(message, th);
		this.task = task; 
	}
}
