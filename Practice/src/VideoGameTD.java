public class VideoGameTD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    VideoGame v = new VideoGame();
		VideoGame red = new RedBudHead();
		red.addGame("redBudhead");
		VideoGame candy = new CandyCrush();
		candy.addGame("candyCrush");
		red.printGame();
		candy.printGame();
	}
}
