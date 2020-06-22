import java.util.Scanner;

public class StringComparission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="sindhu";
		System.out.println("guess the password");
		Scanner s = new Scanner(System.in);
		String guess= s.nextLine();
		System.out.println(password.equals(guess));
		String a ="hello";
		String b = "hello";
		System.out.println(a==b);//both point to same area of memory and save space
		}

}
