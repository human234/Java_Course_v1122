package Lab01;

import javax.swing.*;
import java.awt.*;

public class Panel01 extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("serif", Font.BOLD, 20));
		g.drawString("Welcome Home", 40, 40);
		g.fillOval(300, 75, 50, 50);
		g.setColor(Color.black);
		int x_points [] = {75,175, 275}, y_points [] = {200, 150, 200};
		g.drawPolygon(x_points, y_points, 3);
		g.drawRect(100, 200, 150, 150);
		g.fillRect(150, 275, 50, 75);
		g.drawLine(0, 350, 400, 350);
	}
}
