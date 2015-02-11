package de.deicon.testing.runner.test;

import java.util.List;

import de.deicon.testing.runner.task.TestTask;

/**
 * Collection of TestTasks bundled to a combined test
 * suite.  
 * @author dieter
 *
 */
public interface TestSuite {
	List<TestTask> getTasks();
	void addTask(TestTask task);
}
