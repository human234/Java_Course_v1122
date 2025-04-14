package Lab06;

//Name______________________________ Date_____________
import edu.fcps.Turtle;
import java.awt.Color;
import javax.swing.*;

public class Driver06 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Square Turtles");
		frame.setSize(400, 400);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new TurtlePanel());
		frame.setVisible(true);

		Turtle.setCrawl(true); // a class method
		SquareTurtle[] turtles = new SquareTurtle[20];
		double randomX, randomY, randomHeading, randomSize;
		int randomThickness;
		Color[] colors = { Color.black, Color.blue, Color.cyan, Color.MAGENTA, Color.gray, Color.orange, Color.pink,
						   Color.red, Color.white, Color.LIGHT_GRAY };
		for (int i = 0; i < 10; i++) {
			randomX = Math.random() * 300.0 + 150.0;
			randomY = Math.random() * 300.0 + 150.0;
			randomHeading = Math.random() * 360.0;
			randomSize = Math.random() * 60.0 + 60.0;
			randomThickness = (int) (Math.random() * 20.0);
			turtles[i] = new SquareTurtle(randomX, randomY, randomHeading, randomSize);
			turtles[i].setThickness(10);
			turtles[i].setColor(colors[i]);
			turtles[i].drawShape();
		}
	}
}