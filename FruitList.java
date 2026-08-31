package collections;

import java.util.ArrayList;

public class FruitList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("----Fruit Names----");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}