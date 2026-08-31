package collections;
import java.util.HashSet;

public class NumberSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);

        System.out.println("Elements in the HashSet:");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}