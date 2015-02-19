package de.deicon.testing.runner.scripting;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptUtil {

	public ScriptEngine createEngine(Map<String, Object> scriptingContext) {
		// create a script engine manager
		ScriptEngineManager factory = new ScriptEngineManager();
		// create a JavaScript engine
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		
		if (scriptingContext != null) {
			Set<Entry<String, Object>> entrySet = scriptingContext.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				engine.put(entry.getKey(), entry.getValue());
			}
		}
		return engine;
	}
	
	public static void main(String[] args) {
		new ScriptUtil().createEngine(null);
	}

}
