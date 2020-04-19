
public class Boat {
	private int length;
	public void setLength(int len) {
		length=len;
	}
	public int getLength() {
		return length;
	}
public void move() {
	System.out.println("jhdkjfhsdkjff");
}
}

class RowBoat extends Boat{
	public void rowtheboat() {
		System.out.println("dhfgdhbdnssj");
		}
}
 class  SailBoat extends Boat{
	public void move() {}
	


public void move(int pspeed) {
	System.out.println(" I'm going at speeed"+pspeed);
}
}
