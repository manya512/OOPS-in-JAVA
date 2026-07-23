package exercise3;
import java.util.*;

public class Email_validation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter email address: ");
		String email = sc.nextLine();

		email = email.trim().toLowerCase();

		String domain1 = "@company.com";

		if (email.endsWith(domain1))
			System.out.println("Valid company email");
		else
			System.out.println("Invalid company email");

		sc.close();
	}
}