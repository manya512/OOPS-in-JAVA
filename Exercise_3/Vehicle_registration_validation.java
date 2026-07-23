package exercise3;
import java.util.*;

public class Vehicle_registration_validation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter vehicle registration number: ");
		String reg = new String(sc.nextLine());

		reg = reg.trim().toUpperCase();

		String code1 = "TN";
		String code2 = "KA";
		String code3 = "DL";

		if (reg.startsWith(code1) || reg.startsWith(code2) || reg.startsWith(code3))
			System.out.println("Valid vehicle registration");
		else
			System.out.println("Invalid vehicle registration");

		sc.close();
	}
}