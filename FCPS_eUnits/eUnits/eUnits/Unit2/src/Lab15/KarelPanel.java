package Lab15;
//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com

//version 6.17.2003

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class KarelPanel extends JPanel {
	private static final int WIDTH = 395, HEIGHT = 391; // constants
	private static final Color BACKGROUND = new Color(204, 204, 204);

	private int xPos, yPos, dir; // fields
	private ImageIcon[] myArray;
	private BufferedImage myImage;
	private Graphics myBuffer;

	public KarelPanel() {
		myImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		myBuffer = myImage.getGraphics();
		myArray = new ImageIcon[4];
		myArray[0] = new ImageIcon("src/Lab15/karele.gif"); // east
		myArray[1] = new ImageIcon("src/Lab15/kareln.gif"); // north
		myArray[2] = new ImageIcon("src/Lab15/karelw.gif"); // west
		myArray[3] = new ImageIcon("src/Lab15/karels.gif"); // south
		dir = 0; // start facing east
		xPos = 5; // starting xPos
		yPos = HEIGHT - 3 - myArray[dir].getImage().getHeight(null); // starting yPos
		Timer t = new Timer(250, new Listener());
		t.start();
	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(BACKGROUND);
			myBuffer.fillRect(0, 0, WIDTH, HEIGHT);
			myBuffer.setColor(Color.red);
			for (int x = 17; x < WIDTH; x += 30) // vertical lines
			{
				myBuffer.drawLine(x, 0, x, HEIGHT);
			}
			for (int y = 9; y < HEIGHT; y += 28) // horizontal lines
			{
				myBuffer.drawLine(0, y, WIDTH, y);
			}
			myBuffer.fillRect(107, 121, 180, 56);
			myBuffer.setColor(Color.black);
			myBuffer.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 20));
			myBuffer.drawString("Karel the Robot", 125, 155);

			switch (dir) {
			case 0:
				xPos += 30;
				break;
			case 1:
				yPos -= 28;
				break;
			case 2:
				xPos -= 30;
				break;
			case 3:
				yPos += 28;
				break;
			}

			if (xPos >= 395) {
				xPos = 392 - myArray[1].getImage().getWidth(null);
				yPos = 388 - myArray[1].getImage().getHeight(null);
				dir = 1;
			}
			if (yPos >= 381) {
				xPos = 5;
				yPos = 388 - myArray[0].getImage().getHeight(null);
				dir = 0;
			}
			if (xPos <= -4) {
				xPos = 0;
				yPos = 5;
				dir = 3;
			}
			if (yPos <= -3) {
				xPos = 384 - myArray[1].getImage().getHeight(null);
				yPos = 1;
				dir = 2;
			}
			myBuffer.drawImage(myArray[dir].getImage(), xPos, yPos, null);

			repaint();
		}
	}
}