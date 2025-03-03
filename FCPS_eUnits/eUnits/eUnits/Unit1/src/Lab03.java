import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {
	public static void main(String[] args) {
		Display.openWorld("C://maps/mountain.map");
      Display.setSpeed(10);
      
		Climber karel = new Climber(8);
      
      karel.turnRight();
      karel.move();
      karel.climbUpRight();
      karel.climbUpRight();
      karel.climbUpRight();
      karel.climbDownRight();
      karel.climbDownRight();
      karel.pickBeeper();
      karel.turnAround();
      karel.climbUpLeft();
      karel.climbUpLeft();
      karel.climbDownLeft();
      karel.climbDownLeft();
      karel.climbDownLeft();
      karel.move();
      karel.putBeeper();
   }
}
