package Lab00;

import javax.swing.*;
import java.awt.*;

public class Panel00 extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(100, 50, 270, 60);
		g.setFont(new Font("serif", Font.BOLD, 50));
		g.setColor(new Color(150, 150, 0));
		g.drawString("Hello World", 100, 100);
	}
}
