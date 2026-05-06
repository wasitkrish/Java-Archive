import javax.swing.*;
import java.awt.*;
public class InputDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Input Examplese");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        JTextField input = new JTextField(10);
        JButton button = new JButton("Show");
        JLabel label = new JLabel();
        button.addActionListener(e->{
            label.setText("You enetered: "+input.getText());
        });
        frame.add(input);
        frame.add(button);
        frame.add(label);
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}