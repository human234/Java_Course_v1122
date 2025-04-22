package Lab07;

//Name______________________________ Date_____________
import java.awt.Color;
import edu.fcps.Turtle;

public class Driver07 {
	public static void main(String[] args) {
		Turtle.createFrame();
		PolygonTurtle smidge = new PolygonTurtle(60.0, 3), image = new PolygonTurtle(60.0, 4),
					  bridge = new PolygonTurtle(60.0, 5), page = new PolygonTurtle(60.0, 6);
		smidge.setColor(Color.BLUE);
		smidge.setThickness(6);
		smidge.drawShape();
		image.setColor(Color.BLUE);
		image.setThickness(6);
		image.drawShape();
		bridge.setColor(Color.BLUE);
		bridge.setThickness(6);
		bridge.drawShape();
		page.setColor(Color.BLUE);
		page.setThickness(6);
		page.drawShape();

	}
}