import java.awt.*;
import javax.swing.*;
public class ToDoApp{
    public static void main(String[] args){
        JFrame frame = new JFrame("To DO APP");
        frame.setLayout(new GridLayout(4,1));
        frame.setSize(400,400);
        JTextField input = new JTextField();
        JButton add = new JButton("ADD");
        JButton rem = new JButton("Remove");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        add.addActionListener(e->{
            if(!input.getText().isEmpty()){
                model.addElement(input.getText());
                input.setText("");
            }
        });
        rem.addActionListener(e->{
            int check = list.getSelectedIndex();
            if(check!=-1){
                model.remove(check);
            }
            else{
                JOptionPane.showMessageDialog(frame,"Empty list");
            }
        });
        frame.add(input);
        frame.add(add);
        frame.add(rem);
        frame.add(list);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}