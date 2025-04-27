package Lab09;
//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

//version 6.17.2003

import edu.fcps.Turtle;

public class TurtlePanel extends JPanel {
	public TurtlePanel() {
		Timer t = new Timer(10, new Listener());
		t.start();
	}

	public void paintComponent(Graphics g) {
		g.drawImage(Turtle.getImage(), 0, 0, getWidth(), getHeight(), null);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();// paintImmediately(0, 0, getWidth(), getHeight());
		}
	}
}