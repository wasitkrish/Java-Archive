public class MainApp {
    public static void main(String [] args) {
        QuizSystem sys = new QuizSystem ();
        sys. addParticipant (new Participant ("Amit"));
        sys. addParticipant (new Participant ("Riya"));
        sys. addParticipant (new Participant ("John"));
        new UI(sys);
    }
}