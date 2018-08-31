

import acm.graphics.*;
import java.awt.*;

public class Slider extends GRect implements Runnable {
	
	public Slider(int size, Color color){
		super (size, size);
		setFilled(true);
		setColor(color);
	}

	
	public void run(){
		for (int i=0; i<1000/STEP; i++) {
			pause(40);
			move(STEP,0);
		}
	}
	
	
	private static final double STEP=5;
}
