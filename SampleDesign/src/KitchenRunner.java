
public class KitchenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Microwave microwave = new Microwave();
		Fridge fridge = new Fridge();
		
		Kitchen kitchen = new Kitchen(microwave, fridge);
		
		Vegetable[] vegetables = {new Tomato("Red", "Summer"), new Brinjal("Violet", "Winter")};
		kitchen.startCooking(vegetables);

	}

}
