

public class MyClass {
	int x;

	// Constructor with a parameter
	public MyClass(int x) {
		this.x = x;
	}
	public void  printValue() {
		System.out.println(this);
		System.out.println(this.x);
		this.addValue();
	}
	public void addValue() {
		System.out.println(this.x*2);
	}

	// Call the constructor
	public static void main(String[] args) {
		MyClass myObj = new MyClass(5);
		MyClass[] myClassArray = new MyClass[2];
		myClassArray[0] = new MyClass(4);
		myClassArray[1] = new MyClass(6);
		
		System.out.println(myObj);
		//System.out.println("Value of x = " + myObj.x);
		myObj.printValue();
		
	}
}
