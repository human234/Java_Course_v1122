import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename = JOptionPane.showInputDialog("What robot world?");
		Display.openWorld("maps/" + filename + ".map");
		Display.setSpeed(10);
		Athlete oblivionis = new Athlete();

		while (!oblivionis.nextToABeeper()) {
			oblivionis.turnRight();
			if (oblivionis.frontIsClear()) {
				oblivionis.move();
				continue;
			}
			for (int i = 0; i < 3; i++) {
				oblivionis.turnLeft();
				if (oblivionis.frontIsClear()) {
					oblivionis.move();
					break;
				}
			}
		}
	}
}
