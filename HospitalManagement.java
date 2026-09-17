import java.util.Scanner;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString()
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}


// Doctor extends Person
class Doctor extends Person {
    private String specialization;

    // Constructor
    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    // Getter
    public String getSpecialization() {
        return specialization;
    }

    // toString() chain
    @Override
    public String toString() {
        return super.toString()
                + ", Specialization: " + specialization;
    }
}


// Surgeon extends Doctor
class Surgeon extends Doctor {
    private String surgeryType;

    // Constructor
    public Surgeon(String name, int age, String specialization,
                   String surgeryType) {
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    // toString() chain
    @Override
    public String toString() {
        return super.toString()
                + ", Surgery Type: " + surgeryType;
    }
}


public class HospitalManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read Surgeon details
        System.out.println(
                "Enter Surgeon details (name,age,specialization,surgeryType)"
        );

        String input = sc.nextLine();

        String[] data = input.split(",");

        String name = data[0].trim();
        int age = Integer.parseInt(data[1].trim());
        String specialization = data[2].trim();
        String surgeryType = data[3].trim();

        Surgeon surgeon = new Surgeon(
                name,
                age,
                specialization,
                surgeryType
        );

        // Display details
        System.out.println(surgeon);

        sc.close();
    }
}