package first;

public class Motorbikerunner {

	public static void main(String[] args) {
		Motorbike ducati = new Motorbike();
		Motorbike honda = new Motorbike();
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());
		honda.setSpeed(80);
		System.out.println(honda.getSpeed());
		
		
		

	}

}
