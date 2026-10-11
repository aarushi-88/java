
import java.util.*;

public class AttendanceSystem {
    public static void main(String[] args) {
        HashSet<String> attendance = new HashSet<>();

        String name = "Rohan";

        if(attendance.add(name))
            System.out.println("Attendance marked for " + name);

        if(!attendance.add(name))
            System.out.println(name + " is already marked present");
    }
}
