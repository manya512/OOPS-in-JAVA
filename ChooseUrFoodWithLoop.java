package exercise2;

import java.util.*;
public class ChooseUrFoodWithLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 0;
		int choice;
		do
		{
			System.out.println("Menu\n1.Burger\n2.Pizza\n3.Sandwich\n4.Coffee");
			System.out.println("Enter your choice(1/2/3/4) or 0 to exit: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("Exiting...");
				break;
			case 1:
				System.out.println("Added Burger (₹80)");
				price += 80;
				break;
			case 2:
				System.out.println("Added Pizza (₹120)");
				price += 120;
				break;
			case 3:
				System.out.println("Added Sandwich (₹50)");
				price += 50;
				break;
			case 4:
				System.out.println("Added Coffee (₹40)");
				price += 40;
				break;
			default:
				System.out.println("Invalid menu option");
				
			}
		}while(choice!=0);
		System.out.println("Total Price: ₹"+price);
		sc.close();
	}
}


