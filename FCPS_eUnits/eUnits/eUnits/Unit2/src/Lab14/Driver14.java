package Lab14;

import javax.swing.JFrame;

public class Driver14 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab14");
		frame.setLocation(0, 0);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BumperPanel());
		frame.setVisible(true);
	}
}
