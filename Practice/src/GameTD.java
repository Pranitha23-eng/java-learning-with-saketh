
public class GameTD  {

	public static void main(String[] args) {
		GamingConsole  g = new GamingConsole();

		Ludo l1= new Ludo();
		
		BlackJack b1 = new BlackJack();
		Ludo l2 = new Ludo();
		g.addGame(l1);
		g.addGame(b1);
		g.addGame(l2);
		g.listGames();
		g.display(l1,7);
		
	}
}
