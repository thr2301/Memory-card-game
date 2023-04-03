
// ATHANASIOS ROUDIS AM 5098
import java.util.*;

class Board {
	private Integer[] myarray;
	private int num_of_pairs;
	private int num_of_cards;
	private Random random1;

	public Board(int num_of_pairs) {
		this.num_of_cards = num_of_cards;
		this.num_of_pairs = num_of_pairs;
		random1 = new Random();
		myarray = new Integer[2 * num_of_pairs];
		for (int i = 0; i < num_of_pairs; i++) {
			myarray[i * 2] = i;
		}
		for (int i = 0; i < num_of_pairs; i++) {
			myarray[i * 2 + 1] = i;
		}
		for (int j = 0; j < 2 * num_of_pairs; j++) {
			int r = random1.nextInt(2 * num_of_pairs);
			Integer i = myarray[r];
			myarray[r] = myarray[j];
			myarray[j] = i;
		}
	}

	public void print() {
		System.out.print("\n");
		for (int i = 0; i < 2 * num_of_pairs; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		for (int i = 0; i < 2 * num_of_pairs; i++) {
			System.out.print("--");
		}
		System.out.print("\n");
		for (int i = 0; i < 2 * num_of_pairs; i++) {
			if (myarray[i] == null) {
				System.out.print("  ");
			} else {
				System.out.print("* ");
			}
		}
	}

	public void flash(Integer pos1, Integer pos2) {
		System.out.print("\n");
		for (int i = 0; i < 2 * num_of_pairs; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		for (int i = 0; i < 2 * num_of_pairs; i++) {
			System.out.print("--");
		}
		System.out.print("\n");
		for (int i = 0; i < myarray.length; i++) {
			if (i == pos1) {
				System.out.print(myarray[i] + " ");
			} else if (i == pos2) {
				System.out.print(myarray[i] + " ");
			} else {
				System.out.print("* ");
			}
		}
		delay(3);
		System.out.print("\r");
		for (int i = 0; i < 2 * num_of_pairs; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		for (int i = 0; i < 2 * num_of_pairs; i++) {
			System.out.print("--");
		}
		System.out.print("\n");
		for (int i = 0; i < 2 * num_of_pairs; i++) {
			if (myarray[i] == null) {
				System.out.print("  ");
			} else {
				System.out.print("* ");
			}
		}
	}

	public void delay(int sec) {
		try {
			Thread.currentThread().sleep(1000 * sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean openPositions(Integer po1, Integer po2) {
		boolean c = true;
		if (myarray[po1] == myarray[po2]) {
			System.out.println("Found pair (" + po1 + "," + po2 + ")");
			myarray[po1] = null;
			myarray[po2] = null;
			print();
			c = true;
		} else if (myarray[po1] != myarray[po2]) {
			flash(po1, po2);
			c = false;
		}
		return c;
	}

	public Integer getRandomPosition() {
		Random r2 = new Random(num_of_pairs);
		Integer o = null;
		for (int i = 0; i < myarray.length; i++) {
			int e = r2.nextInt(myarray.length);
			o = e;
		}
		return o;
	}

	public Integer getRandomPosition(Integer card1) {
		Random r3 = new Random(num_of_pairs);
		Integer k = null;
		for (int i = 0; i < myarray.length; i++) {
			if (card1 != i) {
				int e = r3.nextInt(myarray.length);
				k = e;
			}
		}
		return k;

	}

	public boolean containsCard(Integer j) {
		for (int i = 0; i < myarray.length; i++) {
			if (myarray[j] == null) {
				return false;
			}
		}
		return true;
	}

	public Integer getcard() {
		Integer y = null;
		for (int i = 0; i < myarray.length; i++) {
			if (myarray[i] != null) {
				y = myarray[i];
			}
		}
		return y;
	}

	public boolean allPairsFound() {
		boolean e = true;
		for (Integer element : myarray) {
			if (element != null) {
				e = false;
			    break;
			}
		}
		return e;
	}
}

class xcv {
	public static void main(String[] arg) {
		Board w1 = new Board(3);
		w1.print();
		w1.getcard();
		w1.getRandomPosition(2);
		w1.flash(0, 4);
		w1.openPositions(2, 3);
		w1.openPositions(5, 4);
		w1.print();
		w1.containsCard(0);
		w1.openPositions(0, 1);
		w1.allPairsFound();

	}
}
