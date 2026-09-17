public class Room {
    private int roomNumber;
    private String block;
    private String type;

    // Constructor
    public Room(int roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    // Getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public String getType() {
        return type;
    }

    // Setters
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber +
               ", Block: " + block +
               ", Type: " + type;
    }
}