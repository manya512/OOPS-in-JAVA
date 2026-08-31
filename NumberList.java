package collections;

import java.util.ArrayList;

public class NumberList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("First element: " + numbers.get(0));
        System.out.println("Third element: " + numbers.get(2));
        System.out.println("Last element: " + numbers.get(4));
    }
}
