package Lab08;

import java.awt.Color;
import edu.fcps.Turtle;


public class Driver08 {
	public static void main(String[] args) {
		Turtle.createFrame();
		Turtle.clear(Color.white);
		Turtle.setSpeed(10);
		FlowerTurtle timoris = new FlowerTurtle(100, 50, Color.pink),
					 armoris = new FlowerTurtle(250, 50, Color.black),
					 oblivionis = new FlowerTurtle(400, 50, Color.gray),
					 doloris = new FlowerTurtle(550, 50, Color.orange);
		new Thread(timoris).start();
		new Thread(armoris).start();
		new Thread(oblivionis).start();
		new Thread(doloris).start();
	}
}