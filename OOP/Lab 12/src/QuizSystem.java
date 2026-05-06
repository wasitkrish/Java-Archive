import java.util.*;

class Participant{
    String name;
    boolean attempted;
    Participant(String nm){
        this.name=nm;
        this.attempted=false;
    }
    String getName(){
        return name;
    }
    void markAttempted(){
        attempted=true;
    }
    void markNotAttempted(){
        attempted=false;
    }
    boolean didAttempt(){
        return attempted;
    }
}
class QuizSystem{
    ArrayList<Participant> part = new ArrayList<>();
    void addParticipant(Participant p){
        part.add(p);
    }
    String markAttempted(String name){
        for(Participant p : part){
            if(p.didAttempt()){
                return("Has already attempted");
            }
            p.markAttempted();
            return name + " marked as attempted";
        }
        return "Participant not found";
    }
    String markNotAttempted(String name){
        for(Participant p : part) {
            if (p.getName().equals(name)) {
                if (!p.didAttempt()) {
                    return ("ALready not attempted");
                }
                p.markNotAttempted();
                return name + "marked not attempted";
            }
        }
        return "Participant not found";
    }
    String showAttempted(){
        String result ="";
        for(Participant p : part){
            if(p.didAttempt()){
                result+=p.getName()+"\n";
            }
        }
        if(result.equals("")){
            return "No participants attempted";
        }
        return result;
    }
}