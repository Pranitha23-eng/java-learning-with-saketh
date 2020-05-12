import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Account MyAccount=new Account();
		System.out.printf("initial name is:%s%n%n",MyAccount.getName());
		System.out.println("pls enter name:");
		String theName= input.nextLine();//reads line of text
		MyAccount.setName(theName);//put theName in MyAccount object of type Account
		System.out.println();
		System.out.printf("name in my object account is %n%s%n",MyAccount.getName());
		

	}

}
