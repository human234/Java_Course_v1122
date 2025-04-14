import edu.fcps.karel2.Display;

public class Midterm3 {
	static void longRunPut(Athlete arg) {
		arg.putBeeper();
		while (arg.frontIsClear()) {
			arg.move();
			arg.putBeeper();
		}
	}
	
	static void longRunPick(Athlete arg) {
		arg.pickBeeper();
		while (arg.frontIsClear()) {
			arg.move();
			arg.pickBeeper();
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
	static void goDownRow(Athlete arg) {
		arg.turnAround();
		if (arg.facingEast()) {
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
		arg.turnAround();
		for (int i = 0; i < 10; i++) {
			longRunPick(arg);
			if (i != 9) {
				goDownRow(arg);
			}
		}
	}

	public static void main(String[] args) {
		Display.openWorld("maps/mop.map");
		Display.setSpeed(10);
		Athlete armoris = new Athlete(8, 1, Display.WEST,Display.INFINITY);

		for (int i = 0; i < 10; i++) {
			longRunPut(armoris);
			if (i != 9) {
				goUpRow(armoris);
			}
		}
		
		goBackGoBack(armoris);

	}

}
