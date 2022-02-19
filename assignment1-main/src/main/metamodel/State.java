package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	
	private String name;
	private List<Transition> trans = new ArrayList<>();
	
	public State(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addTransition(Transition t) {
		this.trans.add(t);
	}
	

	public List<Transition> getTransitions() {
		return trans;
	}

	public Transition getTransitionByEvent(String event) {
		for( Transition t: trans){
			if(t.getEvent() == event) {
				return t;
			}
		}
		return null;
	}
}
