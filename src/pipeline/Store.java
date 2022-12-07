package pipeline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Store {
	/*
	 * The callStack string is used to distinguish variables and 
	 * different levels of a function call. Each times you call a function,
	 * the name is added to the stack, and when you return the name is
	 * popped. This allows you to only access the correct variables at
	 * any given level in the function call.
	 */
	
	private static String callStack = "";
    private static Map<String, Integer> intVariables = new HashMap<>();;
    private static Map<String, Boolean> boolVariables = new HashMap<>();;
    
    public static void addVariable(String id, String type) {
    	if (type.equals("BOOL")) {
    		boolVariables.put(callStack + id, false);
    	} else if (type.equals("INT")) {
    		intVariables.put(callStack + id, 0);
    	}
    }
    
    public static void setVariable(String id, Integer val) {
    	intVariables.put(callStack + id, val);
    }
    
    public static void setVariable(String id, Boolean val) {
    	boolVariables.put(callStack + id, val);
    }
    
    public static int getIntVariable(String id) {
    	if (intVariables.containsKey(callStack + id)) {
    		return intVariables.get(callStack + id);
    	}
    	return 0;
    }
    
    public static boolean getBoolVariable(String id) {
    	if (boolVariables.containsKey(callStack + id)) {
    		return boolVariables.get(callStack + id);
    	}
    	return false;
    }
    
    public static void push(String name) {
    	callStack = name + ":" + callStack;
    	//System.out.println("Push: " + callStack);
    }
    
    public static void pop() {
    	callStack = callStack.substring(callStack.indexOf(':') + 1);
    	//System.out.println("Pop: " + callStack);
    }
    
    // OPTIONAL pop unsused variables so the Store doesn't get bloated.
    // Currently not working...
    // TODO Fix!
    public static void popVars() {
    	List<String> culledInts = new ArrayList<>();
    	for (Map.Entry<String, Integer> entry: intVariables.entrySet()) {
    		if (entry.getKey().indexOf(callStack) != -1) {
    			culledInts.add(entry.getKey());
    		}
    	}
    	for (String s: culledInts) {
    		intVariables.remove(s);
    	}
    	
    	List<String> culledBools = new ArrayList<>();
    	for (Map.Entry<String, Boolean> entry: boolVariables.entrySet()) {
    		if (entry.getKey().indexOf(callStack) != -1) {
    			culledBools.add(entry.getKey());
    		}
    	}
    	for (String s: culledBools) {
    		boolVariables.remove(s);
    	}
    	

		//System.out.println(Store.print());
    }
    
    public static void reset() {
    	callStack = "";
    	intVariables = new HashMap<>();
    	boolVariables = new HashMap<>();
    }
    
    public static String print() {
    	return intVariables.toString() + " & " + boolVariables.toString();
    }
}
