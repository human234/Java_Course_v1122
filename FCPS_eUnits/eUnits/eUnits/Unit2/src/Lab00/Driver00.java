package Lab00;

import javax.swing.JFrame;

public class Driver00 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab00");
		frame.setSize(450, 200);
		frame.setLocation(100, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel00());
		frame.setVisible(true);
	}

}
