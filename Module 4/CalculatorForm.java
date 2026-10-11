
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorForm extends JFrame implements ActionListener {

    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JTextField result = new JTextField(10);

    JButton add = new JButton("+");

    CalculatorForm() {
        setLayout(new FlowLayout());

        add(t1);
        add(t2);
        add(add);
        add(result);

        add.addActionListener(this);

        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        result.setText(String.valueOf(a + b));
    }

    public static void main(String[] args) {
        new CalculatorForm();
    }
}
