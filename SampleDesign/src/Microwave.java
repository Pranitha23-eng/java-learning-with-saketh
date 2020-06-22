
public class Microwave {
	
	String fManufacturer;
	int fPower;
	int fTimeToCook;
	
	public void start(Vegetable[] vegetables) {
		for (Vegetable v : vegetables) {
			System.out.println("Cooking: "+v.getClass().getSimpleName());
		}
	};
	
	public void stop() {
		System.out.println("Stopping Microwave");
	};
	

}
