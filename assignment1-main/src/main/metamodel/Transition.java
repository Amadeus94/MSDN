package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transition {
	private String event;
	private State to;
	private Runnable effect; 
	//private List<String> = new ArrayList<>();
    private Map<String, Transition> operations  = new HashMap<String, Transition>();
	
    
    public Transition(String event, State to) {
		super();
		this.event = event;
		this.to = to;
	}

	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return to;
	}

	public boolean hasSetOperation() {
		return event =="SET" ? true: false;
		//return operations.containsKey("SET") ? true: false;
	}
	
	
	public boolean hasIncrementOperation() {
		return operations.containsKey("INCREMENT") ? true: false;
	}

	public boolean hasDecrementOperation() {
		return operations.containsKey("DECREMENT") ? true: false;
	}

	public String getOperationVariableName() {
		return event;
	}

	public boolean isConditional() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getConditionVariableName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return false;
	}

}
