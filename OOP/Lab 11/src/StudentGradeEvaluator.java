import javax.swing.*;
import java.awt.*;
public class StudentGradeEvaluator {
    public static void main(String[] args){
        JFrame frame = new JFrame("Grade Evaluator");
        frame.setLayout(new FlowLayout());
         JLabel front = new JLabel("Evaluate grade for Krish: ");
         JTextField marks1 = new JTextField(3);
         JTextField marks2 = new JTextField(3);
         JTextField marks3 = new JTextField(3);
         JButton evaluate = new JButton("Evaluate");
         JTextArea output = new JTextArea(5,50);
         evaluate.addActionListener(e->{
             try{
                 int m1 = Integer.parseInt(marks1.getText());
                 int m2 = Integer.parseInt(marks2.getText());
                 int m3 = Integer.parseInt(marks3.getText());
                 StringBuilder s = new StringBuilder();
                 int total = m1+m2+m3;
                 s.append("Total marks: ").append(total).append("\n");
                 float average = (float)total/3;
                 s.append("Average marks: ").append(average).append("\n");
                 char grade;
                 if(average>=75){
                     grade = 'A';
                 }
                 else if(average>=60){
                     grade = 'B';
                 }
                 else if(average>=40){
                     grade = 'C';
                 }
                 else{
                     grade = 'F';
                 }
                 s.append("Grade: ").append(grade);
                 output.setText(s.toString());
             }
             catch(Exception ex){
                 output.setText("Invalid input Marks");
             }
         });
          frame.add(front);
          frame.add(marks1);
          frame.add(marks2);
          frame.add(marks3);
          frame.add(evaluate);
          frame.add(new JScrollPane(output));
          frame.setSize(300,200);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setVisible(true);
    }
}