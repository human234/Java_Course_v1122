import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab09 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("C://maps/"+filename+".map");
      Display.setSpeed(2000000000);
      Athlete oblivionis = new Athlete(1, 1, Display.EAST, 0);
      
      int reg = 0;
      while(oblivionis.nextToABeeper()){
            oblivionis.pickBeeper();
            reg++;
         }
      for(int i = 0; i < 10; i++){
         oblivionis.move();
         while(oblivionis.nextToABeeper()){
            oblivionis.pickBeeper();
         }
         while(reg != 0){
            oblivionis.putBeeper();
            reg--;
         }
         reg = oblivionis.getBeepers();
      }
   }
}
