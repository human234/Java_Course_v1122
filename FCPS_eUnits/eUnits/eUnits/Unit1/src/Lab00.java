import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab00 {
	public static void main(String[] args) {
		Display.openWorld("maps/first.map");
		Display.setSpeed(10);

		Robot karel = new Robot();

		karel.move();
		karel.pickBeeper();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
	}
}
