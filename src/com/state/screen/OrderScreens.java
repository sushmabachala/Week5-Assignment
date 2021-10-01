package com.state.screen;

public class OrderScreens {
	
	
	public static void main(String[] args) {
		//State pattern to order screens 
		Screen screen = new Screen();
		
		screen.prepareScreen();
		screen.testScreen();
		screen.deliverScreen();
		
	}

}
