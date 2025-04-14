import edu.fcps.Digit;

public class SpecialOne extends Digit implements Runnable{
	public SpecialOne(int x, int y) {
		super(x, y);
	}

	public void display() {
		segment1_Off();
		segment2_Off();
		segment3_Off();
		segment4_Off();
		segment5_On();
		segment6_On();
		segment7_Off();
	}

	public void run() {
		display();
	}
}