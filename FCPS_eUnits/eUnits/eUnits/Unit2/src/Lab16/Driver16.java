package Lab16;

import javax.swing.JFrame;

public class Driver16 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab16");
		frame.setSize(400, 400);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel16());
		frame.setVisible(true);
	}
}
