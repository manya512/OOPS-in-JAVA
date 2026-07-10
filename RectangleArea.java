package exercise2;

import java.util.*;
public class RectangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int length = sc.nextInt();
		System.out.println("Enter breadth: ");
		int breadth = sc.nextInt();
		System.out.println("Area: "+length*breadth);
		System.out.println("Perimeter: "+2*(length+breadth));
		sc.close();
	}
}
