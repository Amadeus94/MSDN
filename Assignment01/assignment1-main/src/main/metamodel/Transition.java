package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transition {
	private String event; //Operation
	private State to;
	

	private String operationVariableName;
	private int operationVariableValue;
	

	private String conditionVariableName;
	private int conditionComparedValue;
	private String condition;

	
	
	public int getOperationVariableValue() {
		return operationVariableValue;
	}

	public void setOperationVariableValue(int operationVariableValue) {
		this.operationVariableValue = operationVariableValue;
	}

	
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setConditionComparedValue(int conditionVariableValue) {
		this.conditionComparedValue = conditionVariableValue;
	}

	public void setConditionVariableName(String conditionVariableName) {
		this.conditionVariableName = conditionVariableName;
	}
	
	
	
    public Transition(String event, State to) {
		super();
		this.event = event;
		this.to = to;
	}

	public Object getEvent() {
		return event;
	}
	
	public void SetEvent(String event) {
		this.event = event;
	}


	public State getTarget() {
		return to;
	}

	public boolean hasSetOperation() {
		return event =="SET" ? true: false;
	}
	
	
	public boolean hasIncrementOperation() {
		return event == "INCREMENT" ? true: false;
	}

	public boolean hasDecrementOperation() {
		return event == "DECREMENT" ? true: false;
	}

	public String getOperationVariableName() {
		// ie get "var"
		return operationVariableName;
	}

	public boolean isConditional() {
//		if(conditionVariableName == "GREATER" || conditionVariableName == "GREATERTHAN" || conditionVariableName == "LESSTHAN" )
//			return true;
//		return false;
		return this.conditionVariableName != null;
	}

	public Object getConditionVariableName() {
		return conditionVariableName;
	}

	public Integer getConditionComparedValue() {
		return conditionComparedValue;
	}

	public boolean isConditionEqual() {
		return condition == "EQUALS" ? true: false;
	}

	public boolean isConditionGreaterThan() {
		return condition == "GREATERTHAN" ? true: false;
	}

	public boolean isConditionLessThan() {
		return condition == "LESSTHAN" ? true: false;
	}

	public boolean hasOperation() {
		return event==null ? false :true;
	}

	public String getOperationalVariableName() {
		return operationVariableName;
	}

	public void setOperationalVariableName(String operationalVariableName) {
		this.operationVariableName = operationalVariableName;
	}

}
