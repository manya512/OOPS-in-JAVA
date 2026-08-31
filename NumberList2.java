package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Iterator<Integer> i = numbers.iterator();

        System.out.println("Elements in the ArrayList:");

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}