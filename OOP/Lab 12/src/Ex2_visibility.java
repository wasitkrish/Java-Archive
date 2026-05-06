import javax.swing.*;
public class Ex2_visibility{
    public static void main(String[] args){
        JFrame frame = new JFrame("Excercise 2");
        frame.setLayout(null);
        JLabel label = new JLabel("Hello World !");
        label.setBounds(50,50,40,20);
        frame.add(label);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}