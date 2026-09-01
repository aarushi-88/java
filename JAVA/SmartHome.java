import java.util.Scanner;

interface Device {

    void turnOn();

    void turnOff();
}


class Fan implements Device {

    @Override
    public void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}


class Light implements Device {

    @Override
    public void turnOn() {
        System.out.println("Light is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}


public class SmartHome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter device (Fan/Light): ");
        String deviceType = sc.nextLine();

        Device device;

        // Polymorphism
        if (deviceType.equalsIgnoreCase("Fan")) {
            device = new Fan();
        } else {
            device = new Light();
        }

        // Turn device on and off
        device.turnOn();
        device.turnOff();

        sc.close();
    }
}