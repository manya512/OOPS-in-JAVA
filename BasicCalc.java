/*Create a basic calculator using a do-while loop and a switch-case block. Prompt the user
for two numbers and an operation (1 for Add, 2 for Subtract, 3 for Exit). Keep running
until they choose option 3.*/

import java.util.Scanner;
public class BasicCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Menu:\n1.Add\n2.Subtract\n3.Exit");
			System.out.println("Enter your choice(1/2/3): ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter n1: ");
				int n1 = sc.nextInt();
				System.out.println("Enter n2: ");
				int n2 = sc.nextInt();
				System.out.println("Answer: "+(n1+n2));
				break;
			case 2:
				System.out.println("Enter n1: ");
				int n3 = sc.nextInt();
				System.out.println("Enter n2: ");
				int n4 = sc.nextInt();
				System.out.println("Answer: "+(n3-n4));
				break;
			case 3:
				System.out.println("Exiting program....");
				break;
			default:
				System.out.println("Invalid choice!!! please select 1,2, or 3.");
			}
		}while(choice!=3);
		sc.close();
	}

}
