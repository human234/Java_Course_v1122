import edu.fcps.karel2.Display;

public class Lab11 {

	public static void main(String[] args) {

		Display.openDefaultWorld();
		Display.setSpeed(10);
		Display.setSize(36, 37);

		new Zero(1, 18).display();
		new Two(13, 18).display();
		new Three(19, 18).display();
		new Four(25, 18).display();
		new Five(31, 18).display();
		new Seven(7, 9).display();
		new Eight(13, 9).display();
		new Nine(19, 9).display();

	}
}
