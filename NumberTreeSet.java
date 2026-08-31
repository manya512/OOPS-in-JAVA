package collections;

import java.util.TreeSet;

public class NumberTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Elements in the TreeSet:");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
