import javax.swing.*;
public class HelloGUI{
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello");
        JLabel label = new JLabel("Hello, Swing");
        frame.add(label);
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}