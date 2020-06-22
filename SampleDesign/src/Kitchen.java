
public class Kitchen {
	
	Microwave fMicrowave;
	Fridge fFridge;
	
	public Kitchen(Microwave microwave, Fridge fridge) {
		this.fMicrowave = microwave;
		this.fFridge = fridge;
	}
	
	public void startCooking(Vegetable[] vegetables) {
		fMicrowave.start(vegetables);
	};
	
	public void startCleaning() {
		System.out.println("Cleaning Completed!");
	};
	
	public void putVegetables(Vegetable[] vegetables) {
		for (Vegetable v : vegetables) {
			fFridge.addItem(v);
		}
	}
	
}
