import java.util.Scanner;

class Room {
    private String roomNumber;
    private String block;
    private String type;

    // Default constructor
    public Room() {
    }

    // Parameterized constructor
    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    // Getters and Setters
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber
                + ", Block: " + block
                + ", Type: " + type;
    }
}


class Student {
    private String name;
    private String roll;
    private String course;
    private Room room;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, String roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    // toString() prints student and room details
    @Override
    public String toString() {
        return "Student Name: " + name
                + "\nRoll: " + roll
                + "\nCourse: " + course
                + "\n" + room;
    }
}


public class HostelAllocation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read Student details
        System.out.println("Enter Student details (name,roll,course)");
        String studentInput = sc.nextLine();

        String[] studentData = studentInput.split(",");

        String name = studentData[0].trim();
        String roll = studentData[1].trim();
        String course = studentData[2].trim();

        // Read Room details
        System.out.println("Enter Room details (roomNumber,block,type)");
        String roomInput = sc.nextLine();

        String[] roomData = roomInput.split(",");

        String roomNumber = roomData[0].trim();
        String block = roomData[1].trim();
        String type = roomData[2].trim();

        // Create Room object
        Room room = new Room(roomNumber, block, type);

        // Allocate Room to Student
        Student student = new Student(
                name,
                roll,
                course,
                room
        );

        // Display details
        System.out.println("\n" + student);

        sc.close();
    }
}