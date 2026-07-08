/*
 
* * * * *
* * * *
* * *
* *
*
 
*/


import java.util.*;
public class StarPattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		for(int i=n;i>0;i--)
		{
			String a = "* ".repeat(i).stripTrailing();
			System.out.println(a);
		}
		sc.close();

	}

}
