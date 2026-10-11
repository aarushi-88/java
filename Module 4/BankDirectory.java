
import java.util.*;

public class BankDirectory {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Ankit");

        System.out.println("Account added successfully.");
        System.out.println("Account No: 101 -> " + map.get(101));
    }
}
