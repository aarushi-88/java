public class Guest {
    private String name;
    private int age;
    private String idProof;

    // Constructor
    public Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIdProof() {
        return idProof;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + idProof;
    }
}