package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
	
	private List<State> states = new ArrayList<State>();
	private State  initialState;
	private List<String> integerList = new ArrayList<>();
	private Map<String, Integer> integerList2 = new HashMap<>();
	
	
	
	public Machine(Collection<State> states, State initialState, List<String> integerList, Map<String, Integer> integerList2 ) {
		super();
		this.states.addAll(states);
		this.initialState = initialState;
		this.integerList = integerList;
		this.integerList2 =integerList2;
	}

	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String stateName) {
		for(State t: states){
			if(t.getName() == stateName) {
				return t;
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		//return integerList.size();
		return integerList2.size();
	}

	public boolean hasInteger(String ints) {
		for( String t: integerList){
			if(t == ints) {
				return true;
			}
	}
		return false;
		
	}

		
	}


