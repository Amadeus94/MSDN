package main;

import java.util.HashMap;
import java.util.Map;

import main.metamodel.*;

public class StateMachine {
	
	private Map<String, State> states = new HashMap<>();
	private State current;
	private State initial = new State("initial State");
	private String currentEvent;

	
	public Machine build() {
		return new Machine(states.values(), initial);
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

	public StateMachine to(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
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
