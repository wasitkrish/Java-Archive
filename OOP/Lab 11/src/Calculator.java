import javax.swing.*;
import java.awt.*;
public class Calculator{
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new FlowLayout());
        JTextField num1 = new JTextField(10);
        JTextField num2 = new JTextField(10);
        JButton add = new JButton("ADD");
        JLabel label = new JLabel();
        add.addActionListener(e->{
            try{
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                label.setText("Sum is: "+(a+b));

            }
            catch(Exception ex){
                label.setText("Invalid Input");
            }
        });
        frame.add(num1);
        frame.add(num2);
        frame.add(add);
        frame.add(label);
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}