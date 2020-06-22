import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String password= "sindhu";
System.out.println("Guess the password");
Scanner s = new Scanner(System.in);
String guess= s.nextLine();
while(!guess.equals(password)) {
	System.out.println("Guess the password");
	guess= s.nextLine();
}

System.out.println("congrats");

	}

}
