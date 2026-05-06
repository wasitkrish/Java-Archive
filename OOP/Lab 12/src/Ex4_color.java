import javax.swing.*;
import java.awt.*;

public class Ex4_color{
    public static void main(String[] args){
        JFrame frame = new JFrame("Excercise 4");
        frame.setLayout(null);
        JLabel label = new JLabel("Color Demo");
        label.setBounds(50,50,150,40);
        label.setForeground(Color.RED);
        label.setBackground(Color.GREEN);
        label.setOpaque(true);
        frame.add(label);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}