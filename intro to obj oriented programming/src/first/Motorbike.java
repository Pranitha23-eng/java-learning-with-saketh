package first;

public class Motorbike {
	private int speed;
	 Motorbike(int speed) {
		  this.speed=speed;
		 
	 }
	
	public int getSpeed() {
		return speed;
	}
	
	  

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("bike started");
	}
}
