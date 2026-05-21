import java.awt.*;
import javax.swing.*;
public class FoodOrderApp extends JFrame{
    private JCheckBox pizza, burger, juice;
    private JTextArea output;
    public FoodOrderApp(){
        setTitle("Food Order App");
        setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pizza = new JCheckBox("Pizza");
        burger = new JCheckBox("Burger");
        juice = new JCheckBox("Juice");

        JButton bill = new JButton("Bill Button");
        output = new JTextArea(8,25);
        add(new JLabel("Selected Items:"));
        add(pizza);
        add(burger);
        add(juice);
        add(bill);
        add(new JScrollPane(output));
        setVisible(true);
        bill.addActionListener(e->calculatebill());
        output.setEditable(false);
    }
    public void calculatebill(){
        int total = 0;
        StringBuilder str = new StringBuilder("Selected Items: \n");
        if(pizza.isSelected()){
            total+=100;
            str.append("Pizza -> rs 100 \n");
        }
        if(burger.isSelected()){
            total+=50;
            str.append("Burger -> rs 50 \n");
        }
        if(juice.isSelected()){
            total+=20;
            str.append("Juice -> rs 20 \n");
        }
        str.append("Total: "+total+"\n");
        output.setText(str.toString());
    }
    public static  void main(String[] args) {
        SwingUtilities.invokeLater(()->new FoodOrderApp());
    }
}