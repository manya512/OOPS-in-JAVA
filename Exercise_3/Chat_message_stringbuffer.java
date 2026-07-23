package exercise3;

import java.util.*;

public class Chat_message_stringbuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter message: ");
		StringBuffer sb = new StringBuffer();

		String input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {
			sb.append(input.charAt(i));
		}

		String message = sb.toString().trim();

		System.out.println("Final message: " + message);

		sc.close();
	}
}
