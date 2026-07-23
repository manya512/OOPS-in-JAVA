package exercise3;

import java.util.*;

public class Customer_feedback_analysis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter customer feedback: ");
		String feedback = sc.nextLine();

		feedback = feedback.trim().toLowerCase();

		String[] keywords = {"bad", "poor", "good", "excellent"};

		System.out.println("Keyword positions:");

		for (String word : keywords) {
			int pos = feedback.indexOf(word);
			if (pos != -1)
				System.out.println(word + " found at position " + pos);
		}

		feedback = feedback.replace("bad", "****");
		feedback = feedback.replace("poor", "****");

		System.out.println("Modified feedback: " + feedback);

		sc.close();
	}
}
