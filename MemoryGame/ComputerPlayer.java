
import java.util.*;

class ComputerPlayer {
	private String c_p_name;
	private int c_p_points = 0;
	private int[] myarray1 = new int[6];

	public ComputerPlayer(String c_p_name) {
		this.c_p_name = c_p_name;
	}

	public void play(Board x) {
		Random r2 = new Random(6);
		Integer o = null;
		int e = r2.nextInt(6);
		o = e;
		for (int i = 0; i < 5; i++) {
			if (myarray1[i] == o) {
				myarray1[i + 1] = o;
			} else {
				myarray1[i] = o;
				int r;
				int j = r2.nextInt(6);
				r = j;
				myarray1[i + 1] = r;
				x.openPositions(o, j);
				if (true) {
					
					c_p_points = getC_p_points() + 1;
					System.out.println(c_p_name + " points :" + getC_p_points());
				}
			}
		}

	}

	public int getC_p_points() {
		return c_p_points;
	}

	public String toString() {
		return c_p_name;
	}

}

class asd {
	public static void main(String[] args) {
		Board w2 = new Board(3);
		ComputerPlayer c1 = new ComputerPlayer("P1");
		c1.play(w2);
	}
}