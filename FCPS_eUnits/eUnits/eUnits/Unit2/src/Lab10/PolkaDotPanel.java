package Lab10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

public class PolkaDotPanel extends JPanel {
	// constants
	private static final int FRAME = 400;
	private static final Color BACKGROUND = new Color(204, 204, 204);
	// fields
	private BufferedImage myImage;
	private Graphics myBuffer;
	private Timer t;
	private Polkadot pd, bd;
	private int xPos, yPos;

	public PolkaDotPanel() {
		myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
		myBuffer = myImage.getGraphics();
		myBuffer.setColor(BACKGROUND);
		myBuffer.fillRect(0, 0, FRAME, FRAME);
		pd = new Polkadot();
		bd = new Polkadot();
		bd.setColor(Color.blue);
		t = new Timer(1000, new Listener());
		t.start();
	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			myBuffer.setColor(Color.white);
			myBuffer.fillRect(0, 0, FRAME, FRAME);
			bd.jump(FRAME, FRAME);
			bd.draw(myBuffer);
			pd.jump(FRAME, FRAME);
			pd.draw(myBuffer);

			repaint();
		}
	}
}