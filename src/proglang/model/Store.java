package proglang.model;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private static Map<String, Integer> intVariables;
    private static Map<String, Boolean> boolVariables;
    
    public static void addVariable(String id, String type) {
    	if (type.equals("BOOL")) {
    		boolVariables.put(id, null);
    	} else if (type.equals("INT")) {
    		intVariables.put(id, null);
    	}
    }
    
    public static void setVariable(String id, Integer val) {
    	intVariables.put(id, val);
    }
    
    public static void setVariable(String id, Boolean val) {
    	boolVariables.put(id, val);
    }
    
    public static int getIntVariable(String id) {
    	return intVariables.get(id);
    }
    
    public static boolean getBoolVariable(String id) {
    	return boolVariables.get(id);
    }
    
    public static void reset() {
    	intVariables = new HashMap<>();
    	boolVariables = new HashMap<>();
    }
}
