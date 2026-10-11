public class Vehicle {
    protected String regNo;
    protected String brand;
    protected double baseRate;

    // Constructor
    public Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Method to calculate rent
    public double calculateRent() {
        return baseRate;
    }

    // Display details
    public void display() {
        System.out.println(regNo + " " + brand +
                " Rent: " + calculateRent());
    }
}