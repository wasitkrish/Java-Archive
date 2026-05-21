import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Superhero{
    String name;
    boolean onMis;
    Superhero(String name){
        this.name=name;
    }
    public String getName(){
    return name;
    }
    public void sendOnMis(){
        onMis=true;
    }
    public void callBack(){
        onMis=false;
    }
    public boolean misStat(){
        return onMis;
    }
}
class SuperManager{
    ArrayList<Superhero> s = new ArrayList<>();
    public void addHero(Superhero sp){
        s.add(sp);
    }
    public String sendOnMis(String name){
        for(Superhero i : s){
            if(i.getName().equals(name)){
                if(i.misStat()){
                    return name + " Already On Mission ";
                }
                i.sendOnMis();
                return name + " Sent on Mission ";
            }
        }
        return " Hero Not Found";
    }
    public String callBack(String name){
        for(Superhero i : s){
            if(i.getName().equals(name)){
                if(!i.misStat()){
                    return name + " Already at Base";
                }
                i.callBack();
                return name + " Returned to Base";
            }
        }
        return "Hero not Found";
    }
    public String showActive(){
        StringBuilder str = new StringBuilder();
        for(Superhero i : s){
            if(i.misStat()){
                str.append(i.getName() + "\n");
            }
        }
        if(str.isEmpty()){
            return "No heros on activer mission";
        }
        else{
            return str.toString();
        }
    }
}
class UID{
    public UID(SuperManager sp){
        JFrame frame = new JFrame("Superhero Mission Control");
        frame.setLayout(new FlowLayout());
        frame.setSize(400,400);
        JTextField input = new JTextField(20);
        JButton sendOnMission = new JButton("Send On Mission");
        JButton callBackToBase = new JButton("Call Back to Base");
        JButton showActive = new JButton("Show Active");
        JTextArea output = new JTextArea(20,20);
        sendOnMission.addActionListener(e -> output.setText(sp.sendOnMis(input.getText())));
        callBackToBase.addActionListener(e-> output.setText(sp.callBack(input.getText())));
        showActive.addActionListener(e-> output.setText(sp.showActive()));
        frame.add(input);
        frame.add(sendOnMission);
        frame.add(callBackToBase);
        frame.add(showActive);
        frame.add(new JScrollPane(output));
        frame.setVisible(true);
        output.setEditable(false);
        output.setLineWrap(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
public class MainApp{
    public static void main(String[] args) {
        SuperManager sp = new SuperManager();
        sp.addHero(new Superhero("Spiderman"));
        sp.addHero(new Superhero("Ironman"));
        sp.addHero(new Superhero("Antman"));
        sp.addHero(new Superhero("BlackWidow"));
        SwingUtilities.invokeLater(()-> new UID(sp));
    }
}