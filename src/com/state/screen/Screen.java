package com.state.screen;

public class Screen {
	
	ScreenState manufacture;
	
	ScreenState testScreen;
	
	ScreenState deliverScreen;
	
	ScreenState state;
	
	public Screen() {
		
		manufacture = new ManufactureScreen(this);
		testScreen = new TestScreen(this);
		deliverScreen = new DeliverScreen(this);
		
		state=manufacture;
	}

	//Getters and Setters
	public ScreenState getManufacture() {
		return manufacture;
	}

	public void setManufacture(ScreenState manufacture) {
		this.manufacture = manufacture;
	}

	public ScreenState getTestScreen() {
		return testScreen;
	}

	public void setTestScreen(ScreenState testScreen) {
		this.testScreen = testScreen;
	}

	public ScreenState getDeliverScreen() {
		return deliverScreen;
	}

	public void setDeliverScreen(ScreenState deliverScreen) {
		this.deliverScreen = deliverScreen;
	}

	public ScreenState getState() {
		return state;
	}

	public void setState(ScreenState state) {
		this.state = state;
	}
	
	//Methods 
	
	public void prepareScreen() {
		state.manufactureScreen();
	}
	
	public void testScreen() {
		state.testScreen();
	}

	public void deliverScreen() {
		state.deliverScreen();
	}
}
