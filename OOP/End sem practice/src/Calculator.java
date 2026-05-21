import javax.swing.*;
import java.awt.*;
public class Calculator{
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JButton b1 = new JButton("Add");
        JButton b2 = new JButton("Subtract");
        JButton b3 = new JButton("Status Check");
        JLabel label = new JLabel("Results: ");
        b1.addActionListener(e->{
            try {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int sum = a + b;
                label.setText("Sum is: " + sum);
            }
            catch(Exception ex){
                label.setText("Invalid Input");
            }
        });
        b2.addActionListener(e->{
            try {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int diff = a - b;
                label.setText("Difference is: " + diff);
            }
            catch(Exception ex){
                label.setText("Invalid Input");
            }
        });
        b3.addActionListener(e->{
            JOptionPane.showMessageDialog(frame,"Vallid State Check");
        });
        frame.add(num1);
        frame.add(num2);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}