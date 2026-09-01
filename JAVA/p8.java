import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an integer array to store marks of 5 students
        int[] marks = new int[5];

        // Read marks of 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Print each student's marks
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        sc.close();
    }
}