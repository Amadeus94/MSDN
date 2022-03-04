package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.*;



// This class is solely for defining operation, and doesn't contain logic... 

public class StateMachine {
	
	private Map<String, State> states = new HashMap<>();
	private State current;
	private State initial = new State("initial State");
	private String currentEvent;
	
	private List<String> integerList = new ArrayList<>();
	
	
	
	
//	private Map<String, Integer> integerList2 = new HashMap<>();
	

	
	public Machine build() {
//		return new Machine(states.values(), initial);
//		return new Machine(states.values(), initial,integerList, integerList2);
		return new Machine(states.values(), initial,integerList);
			
	}

	public StateMachine state(String name) {
		current = getState(name);
		return this;
	}
	
	
	private State getState(String name) {
		if(!states.containsKey(name)) states.put(name, new State(name));
		return states.get(name);
	}
	
	

	public StateMachine initial() {
		initial = current;
		return this;
	}

	public StateMachine when(String event) {
		currentEvent = event;
		return this;
	}

	public StateMachine to(String state) {
	Transition t = new Transition(currentEvent,getState(state));
	current.addTransition(t);
	return this;

	}

	public StateMachine integer(String string) {
	//	integerList2.put(string, 0);
		integerList.add(string);
		
		return this;
	}

	public StateMachine set(String variableName, int i) {
	//	integerList2.put(variableName, i);
	//	integerList.add(variableName);
		current.getTransitionByEvent(currentEvent).setOperationalVariableName(variableName); // "var"
		current.getTransitionByEvent(currentEvent).setOperationVariableValue(i); // "var"
		
		
		current.getTransitionByEvent(currentEvent).SetEvent("SET");
		
		currentEvent = "SET";
		
//		for(int i = 0; i < integerList.size(); i++) {
//			if (integerList.get(i) == event)
//					integerList.set(i, event);
//		}
		return this;
	}

	public StateMachine increment(String variableName) {
//		int i = integerList2.get(variableName);
//		integerList2.put(variableName, i++);
		//currentEvent = "INCREMENT";
		//current.getTransitionByEvent(currentEvent).setOperationalVariableName(variableName);
		
		
		current.getTransitionByEvent(currentEvent).setOperationalVariableName(variableName);
		current.getTransitionByEvent(currentEvent).SetEvent("INCREMENT");
		currentEvent = "INCREMENT";
		
		return this;
	}

	public StateMachine decrement(String variableName) {
//		int i = integerList2.get(variableName);
//		integerList2.put(variableName, i--);
	//	currentEvent = "DECREMENT";
//		current.getTransitionByEvent(currentEvent).setOperationalVariableName(variableName);
	//	current.getTransitionByEvent(currentEvent).setOperationalVariableName(variableName);
		
		current.getTransitionByEvent(currentEvent).setOperationalVariableName(variableName);
		current.getTransitionByEvent(currentEvent).SetEvent("DECREMENT");
		currentEvent = "DECREMENT";
		
		return this;
	}

	public StateMachine ifEquals(String variableName, int i) {
		
		current.getTransitionByEvent(currentEvent).setConditionVariableName(variableName);
		current.getTransitionByEvent(currentEvent).setConditionComparedValue(i);
		
		current.getTransitionByEvent(currentEvent).setCondition("EQUALS");
	//	int j = integerList2.get(string);
	//	return i==j? true : false; 	
		return this;
	}

	public StateMachine ifGreaterThan(String variableName, int i) {
		current.getTransitionByEvent(currentEvent).setConditionVariableName(variableName);
		current.getTransitionByEvent(currentEvent).setConditionComparedValue(i);
		
		current.getTransitionByEvent(currentEvent).setCondition("GREATERTHAN");
		return this;
	}

	public StateMachine ifLessThan(String variableName, int i) {
		current.getTransitionByEvent(currentEvent).setConditionVariableName(variableName);
		current.getTransitionByEvent(currentEvent).setConditionComparedValue(i);
		
		current.getTransitionByEvent(currentEvent).setCondition("LESSTHAN");
		return this;
	}

}
