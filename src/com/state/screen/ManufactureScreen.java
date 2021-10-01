package com.state.screen;

public class ManufactureScreen implements ScreenState {
 
	Screen screen;
	
	
	public ManufactureScreen(Screen screen) {
		super();
		this.screen = screen;
	}

	@Override
	public void manufactureScreen() {
		// TODO Auto-generated method stub
       System.out.println("Started  Manufacturing the monitor screens");
	   screen.setState(screen.getManufacture());
	}

	@Override
	public void testScreen() {
		// TODO Auto-generated method stub
       System.out.println("Testing is Pending ");
	}

	@Override
	public void deliverScreen() {
		// TODO Auto-generated method stub
		 System.out.println("Manufacture is in process. After the testing will deliver the screen ");
	}

}
