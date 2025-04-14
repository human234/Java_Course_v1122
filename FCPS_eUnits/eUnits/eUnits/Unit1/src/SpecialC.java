import edu.fcps.Digit;

public class SpecialC extends Digit implements Runnable {

	public SpecialC(int x, int y) {
		super(x, y);
	}
	
	public void display() {
		segment1_On();
		segment2_On();
		segment3_On();
		segment4_On();
		segment5_Off();
		segment6_Off();
		segment7_Off();
	}
	
	public void run() {
		display();
	}
}
