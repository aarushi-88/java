import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Professor {
    private String name;
    private String employeeId;
    private String specialization;

    // Default constructor
    public Professor() {
    }

    // Parameterized constructor
    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + employeeId
                + ", Specialization: " + specialization;
    }
}


class Department {
    private String deptName;
    private String hodName;
    private List<Professor> professors;

    // Default constructor
    public Department() {
        professors = new ArrayList<>();
    }

    // Parameterized constructor
    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        this.professors = new ArrayList<>();
    }

    // Getters and Setters
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    // Add Professor
    public void addProfessor(Professor p) {
        professors.add(p);
    }

    // Override toString()
    @Override
    public String toString() {
        String result = "Department: " + deptName + "\n";
        result += "HOD: " + hodName + "\n";
        result += "Professors:\n";

        for (Professor p : professors) {
            result += p + "\n";
        }

        return result;
    }
}


public class University {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read Department details
        System.out.println("Enter Department details (deptName,hodName)");
        String departmentDetails = sc.nextLine();

        String[] deptData = departmentDetails.split(",");

        String deptName = deptData[0].trim();
        String hodName = deptData[1].trim();

        Department department = new Department(deptName, hodName);

        // Read number of professors
        System.out.println("Enter number of professors");
        int n = Integer.parseInt(sc.nextLine());

        // Read professor details
        System.out.println(
            "Enter professor details (name,employeeId,specialization)"
        );

        for (int i = 0; i < n; i++) {

            String professorDetails = sc.nextLine();

            String[] professorData = professorDetails.split(",");

            String name = professorData[0].trim();
            String employeeId = professorData[1].trim();
            String specialization = professorData[2].trim();

            Professor professor = new Professor(
                name,
                employeeId,
                specialization
            );

            department.addProfessor(professor);
        }

        // Display department details
        System.out.println(department);

        sc.close();
    }
}