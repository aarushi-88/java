
import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        HashMap<Integer,Integer> inventory = new HashMap<>();

        inventory.put(101,50);

        System.out.println("Product 101 added with stock 50");

        Iterator<Map.Entry<Integer,Integer>> it = inventory.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Integer,Integer> e = it.next();
            System.out.println("Product ID: " + e.getKey() + " Stock: " + e.getValue());
        }
    }
}
