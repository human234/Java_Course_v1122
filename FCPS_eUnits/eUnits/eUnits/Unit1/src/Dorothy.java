import edu.fcps.karel2.Display;

public class Dorothy extends Athlete
{

   public Dorothy()
   {
      super(2,2,Display.EAST,0);
   }

   public boolean findPath()
   {
      if(frontIsClear()){
          move();
      }else{
         return false;
      }
      if(nextToABeeper()){
         return true;
      }else{
         turnAround();
         move();
         turnAround();
         return false;
      }
   }
   
   public void followPath()
   {
      boolean arriveTheEnd = false;
      while(!arriveTheEnd)
      {
         for(int i = 0; i < 3; i++)
         {
            if(i == 1)
            {
               turnLeft();
            }else if(i == 2)
            {
               turnAround();
            }
            
            if(findPath())
            {
               break;
            }
            else if(i == 2)
            {
               arriveTheEnd = true;
            }
         }
      }
   }
}