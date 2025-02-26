import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("C://maps/shuttle.map");
      Display.setSpeed(10);
      
      racer human1 = new racer(1);
      racer human2 = new racer(4);
      racer human3 = new racer(7);
      
      human1.move();
      human1.jumpRight();
      human1.sprint(2);
      human1.pick(7);
      human1.sprint(2);
      human1.pick(5);
      human1.sprint(2);
      human1.pick(3);
      human1.turnAround();
      human1.sprint(6);
      human1.jumpLeft();
      human1.shuttle(1,15);
      
      human2.move();
      human2.jumpRight();
      human2.sprint(2);
      human2.pick(7);
      human2.sprint(2);
      human2.pick(5);
      human2.sprint(2);
      human2.pick(3);
      human2.turnAround();
      human2.sprint(6);
      human2.jumpLeft();
      human2.shuttle(1,15);
      
      human3.move();
      human3.jumpRight();
      human3.sprint(2);
      human3.pick(7);
      human3.sprint(2);
      human3.pick(5);
      human3.sprint(2);
      human3.pick(3);
      human3.turnAround();
      human3.sprint(6);
      human3.jumpLeft();
      human3.shuttle(1,15);
      
   }
}
