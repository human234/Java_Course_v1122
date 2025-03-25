public class Democrate extends MazeEscaper{
   
   public Democrate(){
      super();
   }

   public void walkDownCurrentSegment(){
      if(!leftIsClear() && frontIsClear() && !nextToABeeper()){
         move();
      }
   }
   public void turnToTheNextSegment(){
      if(leftIsClear()){
         turnLeft();
         move();
      }else{
         turnRight();
      }
   }
   
}