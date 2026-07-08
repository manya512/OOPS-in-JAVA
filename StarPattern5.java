import java.util.*;
public class StarPattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int sp =(n*2)-3;
		int str =1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=str;j++)
				System.out.print("* ");
		for(int j=1;j<=sp;j++) {
			System.out.print("  ");
		}
		if(i==n) str--;
		for(int j=1;j<=str;j++) {
			System.out.print("* ");
		}
		str++;
		sp-=2;
		System.out.println();
	}

}
