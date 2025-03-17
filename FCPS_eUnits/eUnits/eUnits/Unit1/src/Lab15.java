   import edu.fcps.karel2.Display;
   public class Lab15
   {
      public static void main(String[] args)
      {
         Display.openDefaultWorld();
         Display.setSize(15,15);
         Display.setSpeed(10);
         
         Dancer armoris = new BackAndForthDancer(2,5,Display.NORTH,0);
         Dancer timoris = new PoorSquareDancer(3,5,Display.NORTH,0);
         Dancer doloris = new MaxSquareDancer(3,5,Display.NORTH,0);
         
         new Thread(armoris).start();
         new Thread(timoris).start();
         new Thread(doloris).start();
      }
   }