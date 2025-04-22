package Lab09;

import java.awt.Color;

import javax.swing.JFrame;

import edu.fcps.Turtle;

public class Driver09 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Lab09");
		frame.setLocation(100, 100);
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new TurtlePanel());
		Turtle.clear(Color.blue);
		TwistyTurtle timoris = new TwistyTurtle(100, 100, 90, 1),
					 armoris = new TwistyTurtle(300, 300, 90, 2),
					 doloris = new TwistyTurtle(450, 450, 90, 0);
		timoris.drawShape();
		armoris.drawShape();
		doloris.drawShape();
	}

}
