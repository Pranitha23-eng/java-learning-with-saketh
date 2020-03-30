
public class ElectricGuitarTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricGuitar e1 = new ElectricGuitar();
		
		e1.setBrand("yamaha");
		System.out.println("brand name is" + e1.getBrand());
		e1.setNumOfPickUps(5);
		System.out.println("Number of pick ups are " + e1.getNumOfPickUps());
		
	
		e1.setRockStarUsesIt(false);
		
		ElectricGuitar e2 = new ElectricGuitar();
		e2.setBrand("yamaha2020");
		System.out.println("brand name is" + e2.getBrand());
		
		}

	}


