public class StudentMarks {
    static void enterMarks(int marks) {
        if (marks < 0 || marks > 100)
            throw new RuntimeException("Marks must be between 0 and 100");
    }

    public static void main(String[] args) {
        try {
            enterMarks(105);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the system");
        }
    }
}