package com.state.screen;

public class DeliverScreen implements ScreenState {

	Screen screen;
	
	
	public DeliverScreen(Screen screen) {
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
		 System.out.println("Screen tested and working fine  ");
	}

	@Override
	public void deliverScreen() {
		// TODO Auto-generated method stub
		 System.out.println("Screen is ready for delivery ");
         screen.setState(screen.getDeliverScreen());
	}

}
