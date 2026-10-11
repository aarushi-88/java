
import java.util.*;

public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Data Structures");
        System.out.println("Book added successfully.");
        System.out.println("Current Books:");
        for(String b : books) {
            System.out.println(b);
        }
    }
}
