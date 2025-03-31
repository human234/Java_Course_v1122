import edu.fcps.karel2.Display;

public class Midterm3 {
	static void longRun(Athlete arg) {
		arg.putBeeper();
		while (arg.frontIsClear()) {
			arg.move();
			arg.putBeeper();
		}
	}

	static void goUpRow(Athlete arg) {
		arg.turnAround();
		if (arg.facingWest()) {
			while (!arg.rightIsClear()) {
				arg.move();
			}
			arg.turnRight();
			arg.move();
			arg.turnRight();
		} else {
			while (!arg.leftIsClear()) {
				arg.move();
			}
			arg.turnLeft();
			arg.move();
			arg.turnLeft();
		}
		while (arg.frontIsClear()) {
			arg.move();
		}
		arg.turnAround();
	}

	static void goBackGoBack(Athlete arg) {
		while (arg.getX() != 1 || arg.getY() != 1) {
			if (arg.leftIsClear()) {
				arg.turnLeft();
				arg.move();
			} else if (arg.frontIsClear()) {
				arg.move();
			} else if (arg.rightIsClear()) {
				arg.turnRight();
				arg.move();
			} else {
				arg.turnAround();
				arg.move();
			}
		}
	}

	public static void main(String[] args) {
		Display.openWorld("maps/mop.map");
		Display.setSpeed(10);
		Athlete armoris = new Athlete(1, 1, Display.EAST, Display.INFINITY);

		for (int i = 0; i < 10; i++) {
			longRun(armoris);
			if (i != 9) {
				goUpRow(armoris);
			}
		}
		goBackGoBack(armoris);

	}

}
