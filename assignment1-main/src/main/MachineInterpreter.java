package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
	
	private Machine machine; // metamodel
	private State currentState; // runtime State

	public void run(Machine m) {
		this.machine = m;
		currentState = machine.getInitialState();
	}

	public State getCurrentState() {
		return currentState;
	}

	public void processEvent(String event) {
		for(Transition t: currentState.getTransitions()) {
			if(t.getEvent().equals(event)) {
			//	t.effect();
				if(t.getEvent().equals("SET"))
					this.machine.integerHashMap.put(t.getOperationalVariableName(),t.getOperationVariableValue());
				else if(t.getEvent().equals("INCREMENT"))
					this.machine.integerHashMap.put(t.getOperationalVariableName(),this.machine.integerHashMap.get(t.getOperationalVariableName()));
				
				
				// I think I need separate operations from events to make this work in transition
				
				
				
				
				currentState = t.getTarget();
				
				
				return;
			}
		}
		System.err.println("Unhandled event "+event);
	}

	public int getInteger(String string) {
		return machine.integerHashMap.get(string);
	}

}
