
public class ElectricGuitar {
	String brand;
	int numOfPickUps;
	boolean rockStarUsesIt;
	
	void setBrand(String aBrand){
		 brand= aBrand;
	}

	String getBrand() {
		return brand;
	}
	
	
	void setNumOfPickUps(int num) {
		numOfPickUps=num;
		
	}
	int getNumOfPickUps() {
		return numOfPickUps;
	}
		boolean getRockStarUsesIt() {
		return rockStarUsesIt;
	}
	void setRockStarUsesIt(boolean yesOrno) {
		if(rockStarUsesIt==false) {
			System.out.println("hahaha");
		}
	}
	
	
	
		
	}


