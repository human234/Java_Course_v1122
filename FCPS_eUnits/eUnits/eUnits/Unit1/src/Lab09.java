import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename = JOptionPane.showInputDialog("What robot world?");
		Display.openWorld("maps/" + filename + ".map");
		Display.setSpeed(10);
		Athlete oblivionis = new Athlete(1, 1, Display.EAST, 0);

		int reg = 0;
		for (int i = 0; i < 10; i++) {
			while (oblivionis.nextToABeeper()) {
				oblivionis.pickBeeper();
			}
			while (reg != 0) {
				oblivionis.putBeeper();
				reg--;
			}
			oblivionis.move();
			reg = oblivionis.getBeepers();
		}
	}
}
