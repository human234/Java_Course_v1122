package Lab20;

//Name:    Date:
import javax.swing.*;

import Lab10.Polkadot;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class PrizePanel extends JPanel {
	private static final int FRAME = 800;
	private static final Color BACKGROUND = new Color(204, 204, 204);
	private BufferedImage myImage;
	private Graphics myBuffer;
	private Ball ball;
	private Polkadot[] pds;
	private Timer t;
	private final int DOTS = 500;
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
		pds = new Polkadot[DOTS];
		for (int i = 0; i < DOTS; i++) {
			pds[i] = new Polkadot(Math.random() * FRAME, Math.random() * FRAME, 15 + 30 * Math.random(), Color.red);
		}
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
			ball.move(FRAME, FRAME);
			for (int i = 0; i < DOTS; i++) {
				pds[i].draw(myBuffer);
				collide(ball, pds[i]);
			}
			ball.draw(myBuffer);
			myBuffer.drawString("Count: " + count, 270, 40);
			repaint();
		}
	}

	private void collide(Ball b, Polkadot pd) {
		double d = distance(ball.getX(), ball.getY(), pd.getX(), pd.getY());
		if (d < pd.getRadius() + ball.getRadius()) {
			count++;
			pd.setColor(Color.yellow);
		}
	}

	private double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
	}
}