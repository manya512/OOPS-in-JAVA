
import java.util.Scanner;

public class ReceiptFormat{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item name: ");
        String name = sc.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter unit price: ");
        double uprice = sc.nextDouble();
        System.out.println("-------------------------------");
        System.out.println("Receipt");
        System.out.println("-------------------------------");
        System.out.println("Item    Quantity    Unit price");
        System.out.println(name+"	"+quantity+"		"+uprice);
        System.out.println("Total	=		"+quantity*uprice);
    }
}

