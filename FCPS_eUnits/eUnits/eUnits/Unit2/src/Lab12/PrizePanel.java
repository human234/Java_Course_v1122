package Lab12;

//Name:    Date:
import javax.swing.*;

import Lab10.Polkadot;
import Lab11.Ball;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class PrizePanel extends JPanel {
	private static final int FRAME = 400;
	private static final Color BACKGROUND = new Color(204, 204, 204);
	private BufferedImage myImage;
	private Graphics myBuffer;
	private Ball ball;
	private Polkadot pd;
	private Timer t;
	private int count = -1;

	// constructor
	public PrizePanel() {
		myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
		myBuffer = myImage.getGraphics();
		myBuffer.setColor(BACKGROUND);
		myBuffer.fillRect(0, 0, FRAME, FRAME);
		t = new Timer(5, new Listener());
		t.start();
		ball = new Ball();
		pd = new Polkadot();
	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(BACKGROUND);
			myBuffer.fillRect(0, 0, FRAME, FRAME);
			myBuffer.setColor(Color.black);
			myBuffer.setFont(new Font("Arial", Font.PLAIN, 30));
			myBuffer.drawString("Count: " + count, 270, 40);
			ball.move(FRAME, FRAME);
			ball.draw(myBuffer);
			pd.draw(myBuffer);
			collide(ball, pd);
			repaint();
		}
	}

	private void collide(Ball b, Polkadot pd) {
		double d = distance(ball.getX(), ball.getY(), pd.getX(), pd.getY());
		if (d < pd.getRadius() + ball.getRadius()) {
			count ++;
			pd.jump(FRAME, FRAME);
		}
	}

	private double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
	}
}