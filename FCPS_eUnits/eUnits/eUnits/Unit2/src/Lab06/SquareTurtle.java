package Lab06;
//Name______________________________ Date_____________
import edu.fcps.Turtle;

public class SquareTurtle extends Turtle {
	private double mySize;

	// *************************constructors*************************
	public SquareTurtle() {
		super();
		mySize = 50.0;
	}

	public SquareTurtle(double n) {
		super();
		mySize = n;
	}

	public SquareTurtle(double x, double y, double h) {
		super(x, y, h);
		mySize = 50.0;
	}

	public SquareTurtle(double x, double y, double h, double n) {
		super(x, y, h);
		mySize = n;
	}

	// ************************methods*****************************
	public void setSize(double n) {
		mySize = n;
	}

	public void drawShape() {
		for(int i = 0; i < 4; i++) {
			forward(mySize);
			turnRight(90);
		}
	}
}