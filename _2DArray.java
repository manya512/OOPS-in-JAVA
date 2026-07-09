/*Initialize a 2D integer array of size 3 X 3 representing a matrix. Use nested loops to print
it out in a clean row-by-column grid format.*/

import java.util.Scanner;

public class _2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		int i,j;
		System.out.println("Enter the elements of the array: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				matrix[i][j]=sc.nextInt();
		}
		System.out.println("Matrix:\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}
		sc.close();
	}

}
