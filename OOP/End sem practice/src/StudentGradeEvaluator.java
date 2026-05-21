import java.awt.*;
import javax.swing.*;
public class StudentGradeEvaluator extends JFrame {
    private JTextField m1,m2,m3;
    private JButton evaluate;
    private JTextArea output;
    StudentGradeEvaluator(){
        setTitle("Student Grade Evaluator");
        setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m1 = new JTextField(5);
        m2 = new JTextField(5);
        m3 = new JTextField(5);
        evaluate = new JButton("Evaluate Grade");
        output = new JTextArea(5,20);
        add(new JLabel("Student Grade Evaluation:"));
        add(m1);
        add(m2);
        add(m3);
        add(evaluate);
        add(new JScrollPane(output));
        evaluate.addActionListener(e-> evaluatemarks());
        setVisible(true);
        output.setEditable(false);
    }
    public void evaluatemarks(){
        StringBuilder str = new StringBuilder("Marks Evaluation: \n");
        try {
            int a = Integer.parseInt(m1.getText());
            int b = Integer.parseInt(m2.getText());
            int c = Integer.parseInt(m3.getText());
            int total = a+b+c;
            double avg = (double)total/3;
            str.append("Total Marks Obtained: "+total+"/300 \n");
            str.append("Obtained Average: "+avg+" \n");
            char grade;
            if(avg>=75){
                grade = 'A';
                str.append("Obtained Grade: "+grade);
            }
            else if(avg>=60){
                grade = 'B';
                str.append("Obtained Grade: "+grade);
            }
            else if(avg>=40){
                grade = 'C';
                str.append("Obtained Grade: "+grade);
            }
            else{
                grade ='F';
                str.append("Obtained Grade: Failed");
            }
            output.setText(str.toString());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Invalid input : make sure to input integer numbers");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new StudentGradeEvaluator());
    }
}