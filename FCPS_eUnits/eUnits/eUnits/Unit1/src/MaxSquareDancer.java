import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class MaxSquareDancer extends Dancer {

	public MaxSquareDancer() {
		super(1, 1, Display.EAST, 0);
	}

	public MaxSquareDancer(int x, int y, int dir, int beep) {
		super(x, y, dir, beep);
	}

	public void danceStep() {
		for (int i = 0; i < 4; i++) {
			move();
			move();
			move();
			move();
			turnRight();
		}
	}
}