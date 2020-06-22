import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "sindhu";

		System.out.println("guess the password");
		Scanner s = new Scanner(System.in);
		String guess = s.nextLine();
		System.out.println(password.equals(guess));
		if (password.equals(guess)) {
			System.out.println("correct");
		} else if ("dont stop".equals(guess)) {
			System.out.println("you got 2nd password");

		} else {
			System.out.println("false");
		}
	}

}
