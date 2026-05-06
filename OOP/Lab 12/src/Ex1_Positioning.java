import javax.swing.*;
public class Ex1_Positioning{
    public static void main(String[] args){
        JFrame frame = new JFrame("Excercise 1");
        frame.setLayout(null);
        JLabel l1 = new JLabel("Label 1");
        JLabel l2 = new JLabel("Label 2");
        JLabel l3 = new JLabel("Label 3");
        l1.setBounds(50,50,100,30);
        l2.setBounds(150,100,100,30);
        l3.setBounds(250,150,100,30);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}