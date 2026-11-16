
package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

    private static final String URL =
            "jdbc:mysql://localhost:3306/company_db";

    private static final String USER = "root";

    // Replace with your actual MySQL root password
    private static final String PASSWORD = "PASSWORD";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void addEmployee(int id, String name,
                            String department, double salary) {

        String sql = "INSERT INTO employees VALUES (?, ?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, department);
            ps.setDouble(4, salary);

            ps.executeUpdate();

            System.out.println("Employee added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewEmployees() {

        String sql = "SELECT * FROM employees";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("department") + " | " +
                                rs.getDouble("salary")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
