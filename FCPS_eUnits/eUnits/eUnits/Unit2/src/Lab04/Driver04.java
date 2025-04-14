package Lab04;

import javax.swing.JFrame;

import edu.fcps.Bucket;

public class Driver04 {

	public static void main(String[] args) {
		Bucket.createFrame();
		Bucket five = new Bucket(5), three = new Bucket(3);
		Bucket.setSpeed(10);
		Bucket.useTotal(false);
		
		
		five.fill();
		five.pourInto(three);
		three.spill();
		five.pourInto(three);
		five.fill();
		five.pourInto(three);
	}

}
