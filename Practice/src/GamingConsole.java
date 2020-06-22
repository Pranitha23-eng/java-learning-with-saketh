public class GamingConsole extends Game {

	String manufacturer;
	int releaseYear;
	int[] z = new int[2];
	Game[] games = new Game[2];
	int i = 0;
	
	public GamingConsole() {
		int x = 5;
	}

	public void addGame(Game g) {
		if(i<games.length) {
			games[i]=g;
			System.out.println("Game added at index"+i );
			i++;
		}
	}
	public void display(Game game, int k) {
		this.games[0]= game;
		this.z[0] = k;
		int x=3;
	}
	
	public void listGames() {
		for(int i=0;i<games.length;i++) {
			System.out.println(games[i]);
		}
	}
}
