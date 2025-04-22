package Lab09;

import java.awt.Color;

import edu.fcps.Turtle;

public class TwistyTurtle extends Turtle {
	
	private int mode;

	TwistyTurtle(double x, double y, double heading, int mode){
		super(x, y, heading);
		this.mode = mode;
	}

	public void drawShape() {
		if(mode == 0) {
			setColor(Color.white);
			for(int i = 5; i <= 400; i += 10) {
				forward(i);
				turnRight(123);
			}
		}else if(mode == 1) {
			setColor(Color.red);
			for(int i = 0; i <= 150; i += 2) {
				forward(i);
				turnRight(30);
			}
		}else if(mode == 2) {
			setColor(Color.orange);
			for(int i = 25; i <= 150; i += 5) {
				for(int j = 0; j < 4; j++) {
					forward(i);
					turnRight(90);
				}
				turnRight(45);
			}
		}
	}
}
