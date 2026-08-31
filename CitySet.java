package collections;

import java.util.HashSet;
import java.util.Scanner;

public class CitySet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<String>();

        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Hyderabad");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a city name: ");
        String city = sc.nextLine();

        if (cities.contains(city)) {
            System.out.println("City is present in the set.");
        } else {
            System.out.println("City is not present in the set.");
        }

        sc.close();
    }
}
