package exercise3;
import java.util.*;

public class insert_word_using_substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter sentence: ");
		String sentence = sc.nextLine();

		System.out.println("Enter word to insert: ");
		String word = sc.nextLine();

		System.out.println("Enter position: ");
		int pos = sc.nextInt();

		String result = sentence.substring(0, pos) + word + sentence.substring(pos);

		System.out.println("Modified sentence: " + result);

		sc.close();
	}
}