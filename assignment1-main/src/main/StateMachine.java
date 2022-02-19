package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.*;

public class StateMachine {
	
	private Map<String, State> states = new HashMap<>();
	private State current;
	private State initial = new State("initial State");
	private String currentEvent;
	private List<String> integerList = new ArrayList<>();
	private Map<String, Integer> integerList2 = new HashMap<>();
	

	
	public Machine build() {
//		return new Machine(states.values(), initial);
		return new Machine(states.values(), initial,integerList, integerList2);
		
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
		integerList2.put(string, null);
		integerList.add(string);
		
		return this;
	}

	public StateMachine set(String event, int i) {
		integerList2.put(event, i);
		integerList.add(event);
		
//		for(int i = 0; i < integerList.size(); i++) {
//			if (integerList.get(i) == event)
//					integerList.set(i, event);
//		}
		return this;
	}

	public StateMachine increment(String string) {
		int i = integerList2.get(string);
		integerList2.put(string, i++);
		return this;
	}

	public StateMachine decrement(String string) {
		int i = integerList2.get(string);
		integerList2.put(string, i--);
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
	//	int j = integerList2.get(string);
	//	return i==j? true : false; 	
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
