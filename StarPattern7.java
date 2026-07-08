	import java.util.Scanner;
	public class DiamondPattern {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number : ");
			int n = sc.nextInt();
			int str =1;
			int mid =(n+1)/2;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=str;j++)
				{
					System.out.print("* ");
				}
				if(i<mid) str++;
				else str--;
				System.out.println();
			
			}
		}
	}