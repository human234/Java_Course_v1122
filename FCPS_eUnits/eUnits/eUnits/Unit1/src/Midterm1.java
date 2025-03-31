import edu.fcps.karel2.Display;

public class Midterm1 {

	public static void main(String[] args) {
		Display.openDefaultWorld();
		Display.setSpeed(10);
		Display.setSize(36, 37);
		BigE e1 = new BigE(1, 9), e2 = new BigE(8, 9);
		HorizontalLeverage hl = new HorizontalLeverage(15, 9);
		One o1 = new One(22, 9);
		Six s1 = new Six(29, 9);
		new Thread(e1).start();
		new Thread(e2).start();
		new Thread(hl).start();
		new Thread(o1).start();
		new Thread(s1).start();

	}

}
