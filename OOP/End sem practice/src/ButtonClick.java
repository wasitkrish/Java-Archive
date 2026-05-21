import java.awt.*;
import javax.swing.*;
public class ButtonClick {
    public static void main(String[] args){
        JFrame frame = new JFrame("ButtonClick");
        JButton btn = new JButton("Click me");
        frame.setLayout(new BorderLayout());
        frame.setSize(400,400);
        btn.addActionListener(e->{
            JOptionPane.showMessageDialog(frame,"You clicke me");
        });
        frame.add(btn,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}