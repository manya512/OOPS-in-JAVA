package collections;

import java.util.HashMap;

public class ItemMap {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<String, Integer>();

        items.put("Apple", 10);
        items.put("Banana", 15);
        items.put("Orange", 20);

        if (items.containsKey("Banana")) {
            items.remove("Banana");
        }

        System.out.println("Updated Map: " + items);
    }
}