import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String productName;
    private double price;
    private int quantity;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Calculate total for the product
    @Override
    public String toString() {
        return productName + " x " + quantity
                + " = " + (price * quantity);
    }
}


class Order {
    private String orderId;
    private List<Product> products;

    // Constructor
    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Add product to order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Calculate total order amount
    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }

        return total;
    }

    // Display order summary
    @Override
    public String toString() {
        String result = "Order ID: " + orderId + "\n";
        result += "Products:\n";

        for (Product product : products) {
            result += product + "\n";
        }

        result += "Total: " + calculateTotal();

        return result;
    }
}


public class ECommerceOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read Order ID
        System.out.print("Enter Order ID: ");
        String orderId = sc.nextLine();

        Order order = new Order(orderId);

        // Read number of products
        System.out.print("Enter number of products: ");
        int n = Integer.parseInt(sc.nextLine());

        // Read product details
        System.out.println(
                "Enter product details (productName,price,quantity)"
        );

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();

            String[] data = input.split(",");

            String productName = data[0].trim();
            double price = Double.parseDouble(data[1].trim());
            int quantity = Integer.parseInt(data[2].trim());

            Product product = new Product(
                    productName,
                    price,
                    quantity
            );

            order.addProduct(product);
        }

        // Display order summary
        System.out.println("\n" + order);

        sc.close();
    }
}