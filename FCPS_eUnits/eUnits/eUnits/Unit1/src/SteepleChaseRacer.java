import edu.fcps.karel2.Display;

public class SteepleChaseRacer extends Racer{
   
   public SteepleChaseRacer(int y){
      super(y);
   }
   
   public void jumpRight(){
      turnLeft();
      int k = 0;
      while(!rightIsClear()){
         move();
         k++;
      }
      turnRight();
      move();
      turnRight();
      for(int i = 0; i < k; i++){
          move();
      }
      turnLeft();
   }
   public void jumpLeft(){
      turnRight();
      int k = 0;
      while(!leftIsClear()){
         move();
         k++;
      }
      turnLeft();
      move();
      turnLeft();;
      for(int i = 0; i < k; i++){
          move();
      }
      turnRight();
   }
   
   public void sprint(int n){
      for(int k = 0; k < n; k++){
         move();
      } 
   }
   
   public void put(int n){
      for(int k = 0; k < n;k++){
         putBeeper();
      }
   }
   
   public void pick(int n){
      for(int k = 0; k < n;k++){
         pickBeeper();
      }
   }
   
   public void shuttle(int spaces, int beepers){
      sprint(spaces);
      pick(beepers);
   }
}