import java.util.Scanner;
public class HourglassPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		for(int i=n;i>0;i--)
		{
			String a = " ".repeat(n-i)+"* ".repeat(i).stripTrailing();
			System.out.println(a);
		}
		for(int i=2;i<=n;i++)
		{
			String a = " ".repeat(n-i)+"* ".repeat(i).stripTrailing();
			System.out.println(a);
		}
		sc.close();
		}
}

