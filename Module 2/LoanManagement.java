import java.util.Scanner;

abstract class Loan {
    protected double principal;
    protected double rate;
    protected double time;

    // Constructor
    public Loan(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    // Abstract method
    public abstract double calculateInterest();
}


// Home Loan
class HomeLoan extends Loan {

    public HomeLoan(double principal, double time) {
        super(principal, 8, time);
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}


// Car Loan
class CarLoan extends Loan {

    public CarLoan(double principal, double time) {
        super(principal, 10, time);
    }

    @Override
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}


public class LoanManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan type (Home/Car): ");
        String type = sc.nextLine();

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();

        Loan loan;

        // Polymorphism
        if (type.equalsIgnoreCase("Home")) {
            loan = new HomeLoan(principal, time);
        } else {
            loan = new CarLoan(principal, time);
        }

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + loan.rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + loan.calculateInterest());

        sc.close();
    }
}