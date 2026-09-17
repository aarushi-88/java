import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an array to store marks of 5 subjects
        int[] marks = new int[5];

        int total = 0;

        // Read marks of 5 subjects
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        // Calculate average
        double average = total / 5.0;

        // Assign grade using if-else
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else {
            grade = 'C';
        }

        // Display results
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}