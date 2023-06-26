
import java.util.*;

class HumanPlayer {
	private String player_name;
	private int player_points;

	public HumanPlayer(String player_name) {
		this.player_name = player_name;

	}

	public void play(Board x) {
		System.out.print(player_name + ", give two positions, to open :");
		Scanner r1 = new Scanner(System.in);
		Integer a1 = r1.nextInt();
		Integer b1 = r1.nextInt();
		if (a1 == b1 || a1 == null || b1 == null) {
			System.out.println("Selection not valid");
			System.out.print(player_name + ", give two positions, to open :");
			a1 = r1.nextInt();
			b1 = r1.nextInt();
		}
		x.openPositions(a1, b1);
		if (true) {

			player_points =getPlayer_points()+1;
			System.out.println(player_name + " points :" + getPlayer_points());
		}
	}

	public int getPlayer_points() {
		return player_points;
	}

	public String toString() {
		return player_name;
	}
}