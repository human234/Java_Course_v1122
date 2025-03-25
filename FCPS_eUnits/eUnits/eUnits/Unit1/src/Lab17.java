	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
    public class Lab17
   {
       public static void escape_the_maze(MazeEscaper arg)
      {
         arg.walkDownCurrentSegment(); //you are not at the end at the start
         while(!arg.nextToABeeper())
         {
            arg.turnToTheNextSegment();
            arg.walkDownCurrentSegment();
         }
      }
       public static void main(String[] args)
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("C:/Users/ptr93/OneDrive/Documents/GitHub/Java_Course_v1122/FCPS_eUnits/eUnits/eUnits/Unit1/maps/"+filename+".map");
         Display.setSize(8, 8);
         Display.setSpeed(10);
         //escape_the_maze( new Democrat() );
         escape_the_maze( new Democrate() );
      	//escape_the_maze( new Independent() );
      }
   }
