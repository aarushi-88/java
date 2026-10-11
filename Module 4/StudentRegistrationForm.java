
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends Frame implements ActionListener {

    TextField name = new TextField(20);
    TextField roll = new TextField(20);
    TextField course = new TextField(20);
    Button submit = new Button("Submit");

    StudentRegistrationForm() {
        setLayout(new FlowLayout());

        add(new Label("Name"));
        add(name);

        add(new Label("Roll No"));
        add(roll);

        add(new Label("Course"));
        add(course);

        add(submit);

        submit.addActionListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Student Registered");
        System.out.println(name.getText());
        System.out.println(roll.getText());
        System.out.println(course.getText());
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
