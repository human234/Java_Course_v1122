import edu.fcps.karel2.Display;

public class climber extends Athlete{
   
   climber(){
      super(8, 1, Display.NORTH, 0);
   }
   climber(int x,int y, int dir, int beeper){
      super(x, y, dir, beeper);
   }
   
   public void climbUpRight(){
      turnLeft();   
      move();
      move();
      turnRight();
      move();
   }
   public void climbUpLeft(){
      turnRight();
      move();
      move();
      turnLeft(); 
      move();
   }
   public void climbDownRight(){
      move();
      turnRight();
      move();
      move();
      turnLeft();  
   }
   public void climbDownLeft(){
      move();
      turnLeft(); 
      move();
      move();
      turnRight(); 
   }
}