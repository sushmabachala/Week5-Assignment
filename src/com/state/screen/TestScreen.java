package com.state.screen;

public class TestScreen implements ScreenState {

	Screen screen;
	
	
	public TestScreen(Screen screen) {
		super();
		this.screen = screen;
	}

	@Override
	public void manufactureScreen() {
		// TODO Auto-generated method stub
       System.out.println("Screen Manufactured ");
	}

	@Override
	public void testScreen() {
		// TODO Auto-generated method stub
	       System.out.println("Screen is in testing is process ");
           screen.setState(screen.getTestScreen());
	}

	@Override
	public void deliverScreen() {
		// TODO Auto-generated method stub
        System.out.println("Once the test is done , ready for the delivery");
	}

}
