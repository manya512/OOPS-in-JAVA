import java.util.*;
public class EfficientFuel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance travelled: ");
		int distance = sc.nextInt();
		System.out.println("Enter amount of petrol used: ");
		int petrol = sc.nextInt();
		float mileage = distance/petrol;
		if(mileage>15) System.out.println("Fuel Efficient");
		else System.out.println("Not Fuel Efficient");
		sc.close();
	}
}
