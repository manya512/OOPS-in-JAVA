package exercise3;

import java.util.*;

public class Thankyou_message_concat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter customer name: ");
		String name = new String(sc.nextLine());

		System.out.println("Enter product name: ");
		String product = new String(sc.nextLine());

		String message = "Thank you " + name + " for purchasing " + product + " from OurStore";

		System.out.println(message);

		sc.close();
	}
}
