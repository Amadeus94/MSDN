package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
	
	private List<State> states = new ArrayList<State>();
	private State  initialState; // is this also current state or should create new one ? 
	
	public Map<String, Integer> integerHashMap = new HashMap<>();
	
	
	
	public Machine(Collection<State> states, State initialState, List<String> integerList) {
		super();
		this.states.addAll(states);
		this.initialState = initialState;
		
		for(String s: integerList) {
			integerHashMap.put(s, 0);
		}
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
		return integerHashMap.size(); //hash
	}

	public boolean hasInteger(String ints) {
		return integerHashMap.containsKey(ints);
		
//		for( String t: integerHashMap){
//			if(t == ints) {
//				return true;
//			}
//	}
//		return false;
//		
	}
	
	
	
	

		
	}


