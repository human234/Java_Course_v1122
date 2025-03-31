package Lab02;

import javax.swing.*;
import java.awt.*;

public class Panel02 extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.yellow);
		for(int i = 100; i < 260; i+= 20) {
			for(int j = 75; j < 265; j+= 20) {
				g.fillOval(i, j, 20, 20);
			}
		}
		ImageIcon thomas = new ImageIcon("src/Lab02/tj.jpg");
		g.drawImage(thomas.getImage(), 115, 95, null);
		g.setColor(Color.white);
		g.setFont(new Font("scanSerif", Font.ITALIC, 30));
		g.drawString("our fearless leader", 70, 320);
	}
}
