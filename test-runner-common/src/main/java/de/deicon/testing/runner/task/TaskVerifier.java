package de.deicon.testing.runner.task;

public interface TaskVerifier {
	boolean verify(TestTask task, ExecutionContext context) throws VerifyException;
}
