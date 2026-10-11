public class ArrayDivision {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        try {
            int result = arr[5] / 2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero not allowed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of bounds");
        }
    }
}