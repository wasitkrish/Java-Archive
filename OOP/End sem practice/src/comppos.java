import java.awt.*;
import javax.swing.*;
public class comppos{
    public static void main(String args[]){
        JFrame frame = new JFrame("Component positioning");
        frame.setLayout(null);
        JLabel l1 = new JLabel("Label 1");
        JLabel l2 = new JLabel("Label 2");
        JLabel l3 = new JLabel("Label 3");
        frame.setSize(400,300);
        l1.setBounds(50,50,100,30);
        l2.setBounds(150,100,100,30);
        l3.setBounds(250,150,100,30);
        l1.setBackground(Color.GREEN);
        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);
        l2.setBackground(Color.MAGENTA);
        l2.setForeground(Color.black);
        l3.setBackground(Color.BLACK);
        l2.setForeground(Color.pink);
        l1.setForeground(Color.RED);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}