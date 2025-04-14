import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Midterm2 {

	public static void main(String[] args) {
		Display.openWorld("maps/midterm2.map");
		Display.setSpeed(10);
		Taker Armoris = new Taker();
		Rounder Timoris = new Rounder();
		new Thread(Armoris).start();
		new Thread(Timoris).start();
	}
}

class Taker extends Robot implements Runnable {

	Taker() {
		super(1, 2, Display.EAST, 0);
	}

	public void run() {
		move();
		while (nextToABeeper()) {
			pickBeeper();
		}
		int temp = getBeepers();
		for (int i = 0; i < 6; i++) {
			move();
			while (nextToABeeper()) {
				pickBeeper();
			}
			for (int j = 0; j < temp; j++) {
				putBeeper();
			}
			temp = getBeepers();
		}
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();;
		while (nextToABeeper()) {
			pickBeeper();
		}
		temp = getBeepers();
		for (int i = 0; i < 6; i++) {
			move();
			while (nextToABeeper()) {
				pickBeeper();
			}
			turnLeft();
			turnLeft();
			move();
			move();
			for (int j = 0; j < temp; j++) {
				putBeeper();
			}
			turnLeft();
			turnLeft();
			move();
			move();
			temp = getBeepers();
		}
	}
}

class Rounder extends Robot implements Runnable {

	Rounder() {
		super(8, 8, Display.SOUTH, 0);
	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				move();
			}
			turnLeft();
			turnLeft();
			turnLeft();
		}
	}
}