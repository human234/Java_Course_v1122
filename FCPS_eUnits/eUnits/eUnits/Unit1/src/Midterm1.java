import edu.fcps.karel2.Display;

public class Midterm1 {

	public static void main(String[] args) {
		Display.openDefaultWorld();
		Display.setSpeed(10);
		Display.setSize(36, 37);
		
		Two tw1 = new Two(6, 21);
		SpecialC c1 = new SpecialC(12, 21);
		Three t1 = new Three(18, 21), t2 = new Three(23, 21);
		SpecialSix s1 = new SpecialSix(6, 10);
		SpecialOne so1 = new SpecialOne(12,10);
		HorizontalLeverage h1 = new HorizontalLeverage(18, 10);


		new Thread(tw1).start();
		new Thread(c1).start();
		new Thread(t1).start();
		new Thread(t2).start();
		new Thread(s1).start();
		new Thread(so1).start();
		new Thread(h1).start();

	}

}
