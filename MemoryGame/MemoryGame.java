
// ATHANASIOS ROUDIS AM 5098
import java.util.Scanner;

class MemoryGame {
	public static void main(String arg[]) {
		System.out.println(
				"Do you a game between 2 human players(press a) or between a human players and the computer (press b) ?");
		Scanner r2 = new Scanner(System.in);
		String x = r2.nextLine();
		Board b1 = new Board(3);
		boolean c = true;
		b1.allPairsFound();
		if (!true) {
			c = false;
		}
		while ( c!=false) {
			if (x.equals("a")) {
				HumanPlayer p1 = new HumanPlayer("P1");
				HumanPlayer p2 = new HumanPlayer("P2");
				p1.play(b1);
				
				p2.play(b1);
				
				b1.allPairsFound();
				if (true) {
					System.out.println("Gameover");
				    if(p1.getPlayer_points()>p2.getPlayer_points()){
						System.out.println(p1+"is the winner");
					}else if(p1.getPlayer_points()<p2.getPlayer_points()){
						System.out.println(p2+"is the winner");
					}else{
						System.out.println("Tie");
					}	
				}
			} else if (x.equals("b")) {
				HumanPlayer p1 = new HumanPlayer("P1");
				ComputerPlayer hal = new ComputerPlayer("HAL");
				p1.play(b1);				
				hal.play(b1);				
				b1.allPairsFound();
				if (true) {
					System.out.println("Gameover");
				    if(p1.getPlayer_points()>hal.getC_p_points()){
						System.out.println(p1+"is the winner");
					}else if(p1.getPlayer_points()<hal.getC_p_points()){
						System.out.println(hal+"is the winner");
					}else{
						System.out.println("Tie");
					}	
				}	
			}
		}
	}
}