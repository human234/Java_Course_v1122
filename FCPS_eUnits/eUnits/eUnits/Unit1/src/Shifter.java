
//Name______________________________ Date_____________
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Shifter extends Robot implements Runnable, Workable {
	private int myBeepers;

	public Shifter(int y) {
		super(1, y, Display.EAST, 0);

	}

	public void workCorner() {
	}

	public void moveOneBlock() {
	}

	public void turnToTheRight() {
	}

	public void turnToTheNorth() {
	}

	public void run() {
		int reg = 0;
		for (int i = 0; i < 10; i++) {
			while (nextToABeeper()) {
				pickBeeper();
			}
			while (reg != 0) {
				putBeeper();
				reg--;
			}
			move();
			reg = getBeepers();
		}
	}
}