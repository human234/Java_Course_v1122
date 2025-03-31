import edu.fcps.karel2.Display;

public class Seeker extends Athlete {

	public Seeker() {
		super(1, 1, Display.NORTH, 0);
	}

	public void fetchBeeper() {
		if (rightIsClear()) {
			turnRight();
		}
		move();
		if (!nextToABeeper()) {
			fetchBeeper();
		} else {
			turnAround();
			move();
			return;
		}
		if (leftIsClear()) {
			turnLeft();
		}
		move();
	}
}