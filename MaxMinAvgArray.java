import java.util.Scanner;

public class MaxMinAvgArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++)
            nums[i] = sc.nextInt();

        int sum = 0;
        for (int n : nums)
            sum += n;

        double avg = (double) sum / 5;

        int min = 0;
        int max = 0;

        for (int i = 1; i < 5; i++) {
            if (nums[min] > nums[i])
                min = i;
            if (nums[max] < nums[i])
                max = i;
        }

        System.out.println("Average: " + avg);
        System.out.println("Minimum: " + nums[min]);
        System.out.println("Maximum: " + nums[max]);

        sc.close();
    }
}