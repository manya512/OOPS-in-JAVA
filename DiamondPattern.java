/*
 
      *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
* * * * * * *
 * * * * * *
  * * * * *
   * * * *
    * * *
     * *
      *

 */

import java.util.*;
public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			String a = " ".repeat(n-i)+"* ".repeat(i).stripTrailing();
			System.out.println(a);
		}
		for(int i=n-1;i>0;i--)
		{
			String a = " ".repeat(n-i)+"* ".repeat(i).stripTrailing();
			System.out.println(a);
		}
		sc.close();
		}
}

/*
 int str =1;
 int mid =(n+1)/2;
 for(int i=1;i<=n;i++)
 {
 for(int j=1;j<=str;j++)
 {
 system.out.print("* ");
 }
 if(i!=mid) str++;
 else str--;
 System.out.println();
}
}

*/