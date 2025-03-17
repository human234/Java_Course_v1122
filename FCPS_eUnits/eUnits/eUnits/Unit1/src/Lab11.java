import edu.fcps.karel2.Display;

public class Lab11 {


	public static void main(String[] args) {

      Display.openDefaultWorld();
      Display.setSpeed(10);
      Display.setSize(36,37);
      
      Zero zero = new Zero(1,18);
      zero.display();
      One one = new One(7,18);
      one.display();
      Two two = new Two(13,18);
      two.display();
      Three three = new Three(19,18);
      three.display();
      Four four = new Four(25,18);
      four.display();
      Five five = new Five(31,18);
      five.display();
      Six six = new Six(1,9);
      six.display();
      Seven seven = new Seven(7,9);
      seven.display();
      Eight eight = new Eight(13,9);
      eight.display();
      Nine nine = new Nine(19,9);
      nine.display();
      
   }
}
