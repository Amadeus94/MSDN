package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
	
	private Machine machine; // metamodel
	private State currentState; // runtime State

	public void run(Machine m) {
		// TODO Auto-generated method stub	
	}

	public State getCurrentState() {
		// TODO Auto-generated method stub
		return null;
	}

	public void processEvent(String event) {
		for(Transition t: currentState.getTransitions()) {
			if(t.getEvent().equals(event)) {
			//	t.effect();
				currentState = t.getTarget();
				return;
			}
		}
		System.err.println("Unhandled event "+event);
	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
