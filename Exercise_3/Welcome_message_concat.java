package exercise3;

import java.util.*;

public class Welcome_message_concat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of participants: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] names = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter participant name: ");
			names[i] = sc.nextLine();
		}

		String message = "Welcome: ";

		for (int i = 0; i < n; i++) {
			message += names[i];
			if (i != n - 1)
				message += ", ";
		}

		System.out.println(message);

		sc.close();
	}
}
