package Lab05;

//Torbert, e-mail: smtorbert@fcps.edu	
//version 6.17.2003
//version 11.4.09  mlbillington@fcps.edu
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class BugPanel extends JPanel {
	private BufferedImage myImage;
	final int N = 400;
	
	private void chase(Bug src, Bug din, byte[] numOfArrivalRef, Graphics g) {
		if (!src.sameSpot(din)) {
			g.drawLine(src.getX(),src.getY(), din.getX(), din.getY());
			src.walkTowards(din, 0.1);
		} else {
			numOfArrivalRef[0] += 1;
		}
	}
	
	public BugPanel() {
		myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
		Graphics buffer = myImage.getGraphics();
		buffer.setColor(Color.BLUE);
		buffer.fillRect(0, 0, N, N);
		buffer.setColor(Color.YELLOW);

		Bug[] bugs = new Bug[4];
		bugs[0] = new Bug(1,1);
		bugs[1] = new Bug(N,1);
		bugs[2] = new Bug(N,N);
		bugs[3] = new Bug(1,N);
		byte[] numOfArrivalRef = new byte[1];
		while (numOfArrivalRef[0] != 4) {
			chase(bugs[0], bugs[1], numOfArrivalRef, buffer);
			chase(bugs[1], bugs[2], numOfArrivalRef, buffer);
			chase(bugs[2], bugs[3], numOfArrivalRef, buffer);
			chase(bugs[3], bugs[0], numOfArrivalRef, buffer);
		}

	}

	public void paintComponent(Graphics g) {
		g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
	}
}