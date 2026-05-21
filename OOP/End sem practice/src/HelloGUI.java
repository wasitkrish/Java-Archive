import javax.swing.*;
import java.awt.*;
public class HelloGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloGUI");
        JLabel label = new JLabel("Hello Java Swing!!");
        frame.setLayout(new BorderLayout());
        frame.setSize(400,400);
        frame.add(label,BorderLayout.EAST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
