import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {

    public static void takeTheField(Athlete arg){
         arg.move();
         arg.move();
         arg.move();
         arg.move();
         arg.turnRight();
         arg.move();
         arg.move();
      }

	public static void main(String[] args) {
	  Display.openWorld("maps/arena.map");
      Display.setSpeed(10);
      
      Athlete human1 = new Athlete();
      Athlete human2 = new Athlete();
      Athlete human3 = new Athlete();
      Athlete human4 = new Athlete();
      Athlete human5 = new Athlete();
      Athlete human6 = new Athlete();
      
      takeTheField(human1);
      takeTheField(human2);
      takeTheField(human3);
      takeTheField(human4);
      takeTheField(human5);
      takeTheField(human6);
      
      human1.move();
      human1.turnLeft();
      human1.move();

      human2.move();
      human2.move();
      
      human3.move();
      human3.move();
      human3.move();    

      human4.move();
      human4.move();
      human4.move();   
      human4.move();
      
      human5.move();
      human5.move();
      human5.move();   
      human5.move();    
      human5.move(); 
      human5.turnLeft(); 
      human5.move();
      
      human6.move();
      human6.move();
      human6.move(); 
      human6.turnLeft(); 
      human6.move();
      human6.move();   
      
   }
}
