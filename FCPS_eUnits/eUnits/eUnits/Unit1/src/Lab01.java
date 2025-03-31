import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01 {
	public static void main(String[] args) {
		Display.openWorld("maps/school.map");
		Display.setSpeed(10);

		Robot karel = new Robot(), pete = new Robot(4, 5, 3, 0);

		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		pete.pickBeeper();
		pete.move();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.turnLeft();
		pete.turnLeft();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.turnLeft();
		pete.move();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.turnLeft();
		pete.turnLeft();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.turnLeft();
		pete.move();
		pete.move();
		pete.putBeeper();
		pete.turnLeft();
		pete.turnLeft();
		pete.move();
	}
}
