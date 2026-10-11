
import java.util.*;

public class CourseEnrollment {
    public static void main(String[] args) {
        LinkedHashSet<String> students = new LinkedHashSet<>();

        students.add("Aditi");
        students.add("Rohan");

        if(!students.add("Aditi"))
            System.out.println("Aditi is already enrolled");

        System.out.println("Enrolled Students: " + students);
    }
}
