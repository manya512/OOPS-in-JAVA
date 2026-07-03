import java.util.Scanner;
public class InputDebug {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter your age: ");
 int age = scanner.nextInt();
scanner.nextLine();
 System.out.print("Enter your full name: ");
 String name = scanner.nextLine();

 System.out.println(name + " is " + age + " years old.");
 scanner.close();
 }
}
