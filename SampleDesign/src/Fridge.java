
public class Fridge {
	
	String fManufacturer;
	int fPower;
	Vegetable[] fStorage = new Vegetable[100];
	int currentTray = 0;
	
	public void addItem(Vegetable vegetable) {
		fStorage[this.currentTray] = vegetable;
		currentTray++;
	};
	public void remoteItem() {};
}
