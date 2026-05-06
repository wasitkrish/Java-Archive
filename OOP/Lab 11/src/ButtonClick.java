import javax.swing.*;
import java.awt.*;
public class ButtonClick{
    public static void main(String[] args){
        JFrame frame = new JFrame("Button Example");
        frame.setLayout(new FlowLayout());
        JButton button = new JButton("Click me");

        button.addActionListener(e->{
            JOptionPane.showMessageDialog(frame,"Button Clicked");
        });
        frame.add(button);
        frame.setSize(300,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}