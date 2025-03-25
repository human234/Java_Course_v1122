   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
	
    public class Lab19   
    {
       public static void main(String[] args)
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("C:/Users/ptr93/OneDrive/Documents/GitHub/Java_Course_v1122/FCPS_eUnits/eUnits/eUnits/Unit1/maps/"+filename+".map");
         Display.setSize(12, 12);
         Display.setSpeed(10);
      
         Dorothy tomoris = new Dorothy();
         tomoris.followPath();
      }
   }