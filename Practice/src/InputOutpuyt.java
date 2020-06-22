import java.util.Scanner;// packages 

public class InputOutpuyt {

	public static void main(String[] args) { //static: no need to make instances
		// TODO Auto-generated method stub
		System.out.println("your name");//output
		//type identifies= new type();
		Scanner scanner = new Scanner(System.in);//input
	String name = scanner.nextLine(); //  nextLine is not static because we had to create Scanner instance.
		System.out.println("hellooo" + " " +   name);
		String s = new String("pranitha is a good girl");
		System.out.println(s + " :)");// s is a variable
		String easier = "blah";//literal
		System.out.println(easier +" " + s);
		
		
		
		

	}

}
