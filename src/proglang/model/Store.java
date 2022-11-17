package proglang.model;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private static Store instance;
    private Map<String, Integer> intVariables;
    private Map<String, Boolean> boolVariables;
    
    private Store(){
    	intVariables = new HashMap<>();
    	boolVariables = new HashMap<>();
    }
    
    public static synchronized Store getInstance() {
        if (instance == null) {
            instance = new Store();
        }
        return instance;
    }
    
    public void addVariable(String id, int val) {
    	this.intVariables.put(id, val);
    }
    
    public void addVariable(String id, boolean val) {
    	this.boolVariables.put(id, val);
    }
    
    public int getIntVariable(String id) {
    	return this.intVariables.get(id);
    }
    
    public boolean getBoolVariable(String id) {
    	return this.boolVariables.get(id);
    }
    
    public void reset() {
    	instance = null;
    }
}
