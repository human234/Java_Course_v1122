import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab00 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("C://maps/first.map");
      Display.setSpeed(5);
      
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
