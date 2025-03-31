import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Midterm2 {

	public static void main(String[] args) {
		Display.openWorld("maps/school.map");
		Display.setSpeed(10);
		Athlete armoris = new Athlete(1, 1, Display.EAST, 0);
		while (armoris.getX() != 5 || armoris.getY() != 9) {
			while (armoris.nextToABeeper()) {
				armoris.pickBeeper();
			}
			if (armoris.leftIsClear()) {
				armoris.turnLeft();
				armoris.move();
			} else if (armoris.frontIsClear()) {
				armoris.move();
			} else if (armoris.rightIsClear()) {
				armoris.turnRight();
				armoris.move();
			} else {
				armoris.turnAround();
				armoris.move();
			}
		}
		while(armoris.getBeepers() != 0) {
			armoris.putBeeper();
		}
		armoris.turnAround();
		armoris.move();
	}

}
