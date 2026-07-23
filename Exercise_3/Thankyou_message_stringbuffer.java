package exercise3;

import java.util.*;

public class Thankyou_message_stringbuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter customer name: ");
		String name = new String(sc.nextLine());

		System.out.println("Enter product name: ");
		String product = new String(sc.nextLine());

		StringBuffer sb = new StringBuffer();

		sb.append("Thank you ");
		sb.append(name);
		sb.append(" for purchasing ");
		sb.append(product);
		sb.append(" from OurStore");

		System.out.println(sb);

		sc.close();
	}
}
