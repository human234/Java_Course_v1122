package Lab14;
// Name: 				Date:

import java.awt.*;

import Lab10.Polkadot;

public class Bumper {
	private int x, y, xWidth, yWidth;
	private Color myColor;
	
	public Bumper() // default constructor
	{
		x = 100;
		y = 100;
		xWidth = 75;
		yWidth = 150;
		myColor = Color.blue;
	}

	public Bumper(int x, int y, int xWidth, int yWidth, Color c) {
		this.x = x;
		this.y = y;
		this.xWidth = xWidth;
		this.yWidth = yWidth;
		myColor = c;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getXWidth() {
		return xWidth;
	}
	
	public int getYWidth() {
		return yWidth;
	}
	
	public Color getColor() {
		return myColor;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXWidth(int xWidth) {
		this.xWidth = xWidth;
	}
	
	public void setYWidth(int yWidth) {
		this.yWidth = yWidth;
	}
	
	public void setColor(Color color) {
		myColor = color;
	}

	public void jump(int rightEdge, int bottomEdge) {
		x = (int) (Math.random() * rightEdge);
		y = (int) (Math.random() * bottomEdge);
	}

	public void draw(Graphics myBuffer) {
		myBuffer.setColor(getColor());
		myBuffer.fillRect(getX(), getY(), getXWidth(), getYWidth());
	}

	// returns true if any part of the polkadot is inside the bumper
	public boolean inBumper(Polkadot dot) {
		for (int x = getX(); x <= getX() + getXWidth(); x++) // starts at upper left corner(x,y)
			for (int y = getY(); y <= getY() + getYWidth(); y++)
				if (distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius()) // checks every point on the bumper
					return true;
		return false;
	}

	// returns distance between (x1, y1) and (x2, y2)
	private double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
