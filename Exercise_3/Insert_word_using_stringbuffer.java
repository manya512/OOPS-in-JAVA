package Exercise_3;
import java.util.*;

public class Insert_word_using_stringbuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter sentence: ");
		String sentence = sc.nextLine();

		System.out.println("Enter word to insert: ");
		String word = sc.nextLine();

		System.out.println("Enter position: ");
		int pos = sc.nextInt();

		StringBuffer sb = new StringBuffer(sentence);
		sb.insert(pos, word);

		System.out.println("Modified sentence: " + sb);

		sc.close();
	}
}