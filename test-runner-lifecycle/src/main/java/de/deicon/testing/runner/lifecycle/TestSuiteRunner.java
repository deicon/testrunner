package de.deicon.testing.runner.lifecycle;

import java.util.List;

import de.deicon.testing.runner.task.ExecutionContext;
import de.deicon.testing.runner.task.TestTask;
import de.deicon.testing.runner.task.VerifyException;
import de.deicon.testing.runner.test.TestSuite;

/**
 * Runner to execute test suites
 * @author dieter
 *
 */
public class TestSuiteRunner {
	
	private static final String CURRENT = "current";
	private static final String CURRENT_TASK = "currentTask";

	public void runSuite(TestSuite suite) {
		// create execution context
		ExecutionContext context = new BaseExecutionContext();
		
		// start context
		context.start();
		
		// loop tasks
		List<TestTask> tasks = suite.getTasks();
		
		for (TestTask testTask : tasks) {
			context.setVariable(CURRENT_TASK, testTask);
			// execute Task and save result
			Object result = testTask.when(context);
			context.setVariable(CURRENT, result);
			// task verify 
			try {
				boolean taskOk = testTask.then() &&
				verify(testTask, result);
			} catch (VerifyException e) {
				testTask.failed(e.getMessage());
			}
		}
		
		// finish context
		context.finish();
	}

	private boolean verify(TestTask testTask, Object taskResult) {
		return true;
	}
	
}
