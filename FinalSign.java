package exercise2;

import java.util.Scanner;

public class FinalSign {
    
    public int arraySign(int[] nums) {
        int sign = 1; 
        for (int n : nums) {
            if (n == 0) {
                return 0; 
            } 
            if (n < 0) {
                sign = -sign; 
            }
        }
        return sign; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        FinalSign solver = new FinalSign();
        int result = solver.arraySign(arr);
        System.out.println("Result: " + result);
        
        sc.close();
    }
}
