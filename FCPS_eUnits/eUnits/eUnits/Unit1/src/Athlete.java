import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Athlete extends Robot{
   public Athlete(){
      super(1, 1, Display.NORTH, Display.INFINITY);
   }
   public Athlete(int x, int y, int dir, int beeper){
      super(x, y, dir, beeper);
   }
   public void turnAround(){
      turnLeft();
      turnLeft();
   }
   public void turnRight(){
      turnLeft();
      turnLeft();
      turnLeft();
   }
}