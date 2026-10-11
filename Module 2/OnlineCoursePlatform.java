import java.util.Scanner;

class Course {
    private String courseName;
    private int duration;

    // Default constructor
    public Course() {
    }

    // Parameterized constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course: " + courseName
                + ", Duration: " + duration + " months";
    }
}


class Student {
    private String name;
    private Course enrolledCourse;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, Course enrolledCourse) {
        this.name = name;
        this.enrolledCourse = enrolledCourse;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(Course enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }

    @Override
    public String toString() {
        return "Student: " + name
                + "\n" + enrolledCourse;
    }
}


// PremiumStudent inherits from Student
class PremiumStudent extends Student {
    private double discount;

    // Constructor
    public PremiumStudent(String name, Course enrolledCourse,
                          double discount) {
        super(name, enrolledCourse);
        this.discount = discount;
    }

    // Getter and Setter
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nDiscount: " + discount + "%";
    }
}


public class OnlineCoursePlatform {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read course details
        System.out.println("Enter Course details (courseName,duration)");
        String courseInput = sc.nextLine();

        String[] courseData = courseInput.split(",");

        String courseName = courseData[0].trim();
        int duration = Integer.parseInt(courseData[1].trim());

        Course course = new Course(courseName, duration);

        // Read student type
        System.out.print("Enter student type (Normal/Premium): ");
        String studentType = sc.nextLine();

        // Read student name
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        Student student;

        if (studentType.equalsIgnoreCase("Premium")) {

            System.out.print("Enter discount: ");
            double discount = sc.nextDouble();

            student = new PremiumStudent(
                    studentName,
                    course,
                    discount
            );

        } else {

            student = new Student(
                    studentName,
                    course
            );
        }

        // Display details
        System.out.println("\n" + student);

        sc.close();
    }
}