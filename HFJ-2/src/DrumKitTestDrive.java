
public class DrumKitTestDrive {

	static	public  void main(String[] args) {
		// TODO Auto-generated method stub
		DrumKit d = new DrumKit();
		d.snare= false;
		if(d.snare==true) {
			d.playSnare();
		}
		
		d.playSnare();
		d.snare= false;
		if(d.snare==true) {
			d.playSnare();
		}
		d.playTopHat();
		}
	}



