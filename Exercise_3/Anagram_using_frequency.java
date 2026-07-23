package exercise3;

import java.util.*;

public class Anagram_using_frequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first word: ");
		String s1 = sc.nextLine().toLowerCase();

		System.out.println("Enter second word: ");
		String s2 = sc.nextLine().toLowerCase();

		boolean result = true;

		if (s1.length() != s2.length()) {
			result = false;
		}
		else {
			int[] count = new int[26];

			for (int i = 0; i < s1.length(); i++) {
				count[s1.charAt(i) - 'a']++;
				count[s2.charAt(i) - 'a']--;
			}

			for (int i = 0; i < 26; i++) {
				if (count[i] != 0) {
					result = false;
					break;
				}
			}
		}

		if (result)
			System.out.println("The words are anagrams");
		else
			System.out.println("The words are not anagrams");

		sc.close();
	}
}
