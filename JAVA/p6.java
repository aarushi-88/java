import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Print multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}