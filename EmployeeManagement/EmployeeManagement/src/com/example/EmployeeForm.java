
package com.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class EmployeeForm extends JFrame {

    private JTextField idField, nameField, departmentField, salaryField;
    private EmployeeDAO dao = new EmployeeDAO();

    public EmployeeForm() {

        setTitle("Employee Management System");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Employee ID:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Department:"));
        departmentField = new JTextField();
        panel.add(departmentField);

        panel.add(new JLabel("Salary:"));
        salaryField = new JTextField();
        panel.add(salaryField);

        JButton submitButton = new JButton("Submit");
        JButton viewButton = new JButton("View All Employees");

        panel.add(submitButton);
        panel.add(viewButton);

        add(panel);

        submitButton.addActionListener(e -> addEmployee());

        viewButton.addActionListener(e -> viewEmployees());
    }

    private void addEmployee() {

        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String department = departmentField.getText();
            double salary = Double.parseDouble(salaryField.getText());

            dao.addEmployee(id, name, department, salary);

            JOptionPane.showMessageDialog(this,
                    "Employee added successfully!");

            idField.setText("");
            nameField.setText("");
            departmentField.setText("");
            salaryField.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid ID and Salary!");
        }
    }

    private void viewEmployees() {

        String[] columns = {"ID", "Name", "Department", "Salary"};

        DefaultTableModel model = new DefaultTableModel(columns, 0);

        try (var con = EmployeeDAO.getConnection();
             var stmt = con.createStatement();
             var rs = stmt.executeQuery("SELECT * FROM employees")) {

            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("emp_id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")
                });
            }

            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);

            JFrame tableFrame = new JFrame("All Employees");
            tableFrame.add(scrollPane);
            tableFrame.setSize(600, 300);
            tableFrame.setLocationRelativeTo(this);
            tableFrame.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Database Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EmployeeForm().setVisible(true);
        });
    }
}
