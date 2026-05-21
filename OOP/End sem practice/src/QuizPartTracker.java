import java.util.*;
import java.awt.*;
import javax.swing.*;
class participant{
    String name;
    boolean attempted;
    participant(String name){
        this.name=name;
        this.attempted=false;
    }
    public String getName(){
        return name;
    }
    public boolean isAttempted(){
        return attempted;
    }
    public void setAttempted(){
        attempted=true;
    }
    public void setNotAttempted(){
        attempted=false;
    }
}
class QuizSystem{
    ArrayList<participant> pa = new ArrayList<>();
    void addParticipant(participant p){
        pa.add(p);
    }
    String markAttempted(String name){
        for(participant i : pa){
            if(i.getName().equals(name)){
                if(i.isAttempted()){
                    return("Has already attempted");
                }
                i.setAttempted();
                return name+" marked as attempted";
            }
        }
        return " participant not found";
    }
    String markNotAttempted(String name){
        for(participant i : pa){
           if(i.getName().equals(name)){
               if(!i.isAttempted()){
                   return("Already marked not attempted");
               }
               i.setNotAttempted();
               return name + "Marked not attempted";
           }
        }
        return " participant not found";
    }
    String showAttempted(){
        StringBuilder str = new StringBuilder();
        for(participant i : pa){
            if(i.isAttempted()){
                str.append(i.getName()+"\n");
            }
        }
        if(str.isEmpty()){
            return("No attempted");
        }
        String stro = str.toString();
        return stro;
    }
}
class UI{
    public UI(QuizSystem qs){
        JFrame frame = new JFrame("Quiz System");
        frame.setLayout(new FlowLayout());
        frame.setSize(400,400);
        JTextField name = new JTextField(20);
        JTextArea output = new JTextArea(10,20);
        JButton markPresent = new JButton("Mark Attempted");
        markPresent.addActionListener(e -> output.setText(qs.markAttempted(name.getText())));
        JButton markAbsent = new JButton("Mark Not Attempted");
        markAbsent.addActionListener(e -> output.setText(qs.markNotAttempted(name.getText())));
        JButton showPresent = new JButton("Show Attempted");
        showPresent.addActionListener(e-> output.setText(qs.showAttempted()));
        frame.add(new JLabel("Quiz System"));
        frame.add(name);
        frame.add(markPresent);
        frame.add(markAbsent);
        frame.add(showPresent);
        frame.add(new JScrollPane(output));
        output.setEditable(false);
        output.setLineWrap(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class QuizPartTracker{
    public static void main(String[] args){
        QuizSystem qs = new QuizSystem();
        qs.addParticipant(new participant("Krish"));
        qs.addParticipant(new participant("Salan"));
        qs.addParticipant(new participant("Niranjan"));
        qs.addParticipant(new participant("Piyush"));
        SwingUtilities.invokeLater(()-> new UI(qs));
    }
}