package exercise2;

import java.util.*;
public class MatrixMultiplcation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1,r2,c1,c2;
		
		System.out.println("Enter the number of rows for first matrix: ");
		r1 = sc.nextInt();
		System.out.println("Enter the number of columns for the first matrix: ");
		c1 = sc.nextInt();
		System.out.println("Enter the number of rows for the second matrix: ");
		r2 = sc.nextInt();
		System.out.println("Enter the number of columns for the second matrix: ");
		c2 = sc.nextInt();
		
		int[][] matrix1 = new int[r1][c1];
		int[][] matrix2 = new int[r2][c2];
		int[][] productmatrix = new int[r1][c2];
		
		System.out.println("Enter the elements for the first matrix: ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.println("Element["+i+"]["+j+"]: ");
				matrix1[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements for the second matrix: ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.println("Element["+i+"]["+j+"]: ");
				matrix2[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
					productmatrix[i][j]=matrix1[i][k]*matrix2[k][j];
			}
		}
		
		System.out.println("Product matrix: ");
		for (int i=0;i<r1;i++) {
           for (int j=0;j<c2;j++) {
            
               System.out.printf("%-8d", productmatrix[i][j]);
           }
           System.out.println();
       }
		sc.close();
	}
}

