import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {
   public static void main(String[] args) {
	  Display.openWorld("maps/shuttle.map");
      Display.setSpeed(2000000000);
      
      Racer human1 = new Racer(1);
      Racer human2 = new Racer(4);
      Racer human3 = new Racer(7);
      
      human1.move();
      human1.jumpRight();
      human1.shuttle(2,7);
      human1.turnAround();
      human1.sprint(2);
      human1.jumpLeft();
      human1.move();
      human1.put(7);
      human1.turnAround();
      human1.move();
      human1.jumpRight();
      human1.shuttle(4,5);
      human1.turnAround();
      human1.sprint(4);
      human1.jumpLeft();
      human1.move();
      human1.put(5);
      human1.turnAround();
      human1.move();
      human1.jumpRight();
      human1.shuttle(6,3);
      human1.turnAround();
      human1.sprint(6);
      human1.jumpLeft();
      human1.move();
      human1.put(3);

      human2.move();
      human2.jumpRight();
      human2.shuttle(2,7);
      human2.turnAround();
      human2.sprint(2);
      human2.jumpLeft();
      human2.move();
      human2.put(7);
      human2.turnAround();
      human2.move();
      human2.jumpRight();
      human2.shuttle(4,5);
      human2.turnAround();
      human2.sprint(4);
      human2.jumpLeft();
      human2.move();
      human2.put(5);
      human2.turnAround();
      human2.move();
      human2.jumpRight();
      human2.shuttle(6,3);
      human2.turnAround();
      human2.sprint(6);
      human2.jumpLeft();
      human2.move();
      human2.put(3);
      
      human3.move();
      human3.jumpRight();
      human3.shuttle(2,7);
      human3.turnAround();
      human3.sprint(2);
      human3.jumpLeft();
      human3.move();
      human3.put(7);
      human3.turnAround();
      human3.move();
      human3.jumpRight();
      human3.shuttle(4,5);
      human3.turnAround();
      human3.sprint(4);
      human3.jumpLeft();
      human3.move();
      human3.put(5);
      human3.turnAround();
      human3.move();
      human3.jumpRight();
      human3.shuttle(6,3);
      human3.turnAround();
      human3.sprint(6);
      human3.jumpLeft();
      human3.move();
      human3.put(3);    
   }
}
