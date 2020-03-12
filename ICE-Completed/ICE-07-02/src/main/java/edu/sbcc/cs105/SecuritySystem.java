package edu.sbcc.cs105;

public class SecuritySystem {

	private SystemState currentState;
	private String code;
	
	public SecuritySystem (String code) {
		this.code = code;	
		currentState = SystemState.Armed;
	}
	
	public SystemState getState() {
		return currentState;
	}
	
	public void disarm(String code) {
		setState(code, SystemState.Disarmed);
	}
	
	public void arm(String code) {
		setState(code, SystemState.Armed);
	}
	
	
	private void setState(String code, SystemState newState) {
		if (this.code.equals(code)) {
			currentState = newState;
		}
	}
}

