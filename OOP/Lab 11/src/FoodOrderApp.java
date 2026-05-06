import javax.swing.*;
import java.awt.*;
public class FoodOrderApp extends JFrame {
    private JCheckBox pizza, burger, juice;
    private JTextArea output;
    public FoodOrderApp() {
        setTitle("Food Ordering app");
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pizza = new JCheckBox("  Pizza -> 100 rs");
        burger = new JCheckBox("Burger -> 80 rs");
        juice = new JCheckBox("juice -> 50rs");

        JButton billButton = new JButton("Calculate Bill");
        output = new JTextArea(8,25);
        output.setEditable(false);

        add(new JLabel("Selected items"));
        add(pizza);
        add(burger);
        add(juice);
        add(billButton);
        add(new JScrollPane(output));
        setVisible(true);

        billButton.addActionListener(e-> calculateBill());

    }
    private void calculateBill() {
        int total=0;
        StringBuilder bill = new StringBuilder("Selected items: \n");
        if(pizza.isSelected()){
            total+=100;
            bill.append("Pizza -> 100rs \n");
        }
        if(burger.isSelected()){
            total+=50;
            bill.append("Burger -> 80rs \n");
        }
        if(juice.isSelected()){
            total+=50;
            bill.append("juice -> 50rs \n");
        }
        bill.append("Total: ").append(total).append("\n");
        output.setText(bill.toString());
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new FoodOrderApp());
    }
}