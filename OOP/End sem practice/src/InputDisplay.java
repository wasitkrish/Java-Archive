import java.awt.*;
import javax.swing.*;
public class InputDisplay{
    public static void main(String[] args) {
        JFrame frame = new JFrame("InputDisplay");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(400,100);
        JTextField input = new JTextField(10);
        JButton btn = new JButton("Display");
        JLabel label = new JLabel();
        btn.addActionListener(e->{
            label.setText(input.getText());
        });
        frame.add(input);
        frame.add(btn);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}