import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an array to store 10 integers
        int[] numbers = new int[10];

        // Read 10 integers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Assume the first element is the maximum
        int max = numbers[0];

        // Find the maximum value using a loop
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display the maximum value
        System.out.println("Maximum value: " + max);

        sc.close();
    }
}