/* Write Java Program to Find the Tranpose of Matrix */

import java.util.*;
public class TransposeOfaMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Enter number of rows: ");
		n = sc.nextInt();
		System.out.println("Enter number of columns: ");
		m = sc.nextInt();
		int[][] arr = new int[n][m];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				arr[i][j]=sc.nextInt();
		}
		System.out.println("Matrix:");
		for(int j=0;j<m;j++)
		{
			for(int i=0;i<n;i++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		sc.close();
	}

}
