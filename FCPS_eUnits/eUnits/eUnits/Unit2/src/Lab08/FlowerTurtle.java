package Lab08;

//Name______________________________ Date_____________
import edu.fcps.Turtle;
import java.awt.Color;

public class FlowerTurtle extends Turtle implements Runnable {
	private double mySize;
	private Color myColor;

	public FlowerTurtle() {
		mySize = 50.0;
		myColor = Color.RED;
	}

	public FlowerTurtle(double x, double n, Color c) {
		super(x, 300.0, 90.0);
		mySize = n;
		myColor = c;
	}

	public void setSize(double n) {
		mySize = n;
	}

	public void setColor(Color c) {
		myColor = c;
	}

    private void synForward() {
    	synchronized(this) {
        	super.setColor(myColor);
        	forward(mySize);
    	}
    }
    
    private void drawPetals() // starts and ends at center facing north
	{

		for (int i = 0; i < 36; i++) {
			turnRight(10);
			synForward();
			back(mySize);
		}
		turnRight(180);
	}
    
	private void drawStem() // starts at top of stem facing south, ends at bottom
	{
		super.setColor(Color.green);
		forward(mySize * 3);
		turnRight(150);
		forward(mySize * 0.5);
		back(mySize * 0.5);
		turnRight(60);
		forward(mySize * 0.5);
	}

	public void drawShape() {
		drawPetals();
		drawStem();
	}
	
	public void run() {
		drawShape();
	}

}