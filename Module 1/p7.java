public class p7 {
    public static void main(String[] args) {

        int number = 1;
        int sum = 0;

        // Find the sum of even numbers from 1 to 50
        while (number <= 50) {

            if (number % 2 == 0) {
                sum = sum + number;
            }

            number++;
        }

        System.out.println("Sum of even numbers from 1 to 50: " + sum);
    }
}