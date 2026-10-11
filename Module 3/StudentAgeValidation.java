class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}

class Student {
    void registerStudent(int age) throws InvalidAgeException {
        if (age < 17) throw new InvalidAgeException("Age must be above 17 for registration");
    }
}

public class StudentAgeValidation {
    public static void main(String[] args) {
        try {
            new Student().registerStudent(15);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}