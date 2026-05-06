import javax.swing .*;
public class UI {
    public UI( QuizSystem sys) {
        JFrame frame = new JFrame("Quiz Tracker ");
        frame. setLayout (null);
        JTextField input = new JTextField ();
        input. setBounds (50, 30, 200, 30);
        JTextArea output = new JTextArea ();
        output. setBounds (50, 80, 300, 120);
        JButton show = new JButton ("Show Attempted ");
        JButton mark = new JButton ("Mark Attempted ");
        JButton unmark = new JButton ("Mark Not Attempted ");
        show. setBounds (50, 220, 150, 30);
        mark. setBounds (210 , 220, 150, 30);
        unmark. setBounds (120 , 260, 200, 30);
        show. addActionListener (e ->
                output. setText (sys. showAttempted ())
        );
        mark. addActionListener (e ->
                output. setText (sys. markAttempted (input. getText ()))
        );
        unmark. addActionListener (e ->
                output. setText (sys. markNotAttempted (input. getText ()))
        );
        frame.add(input);
        frame.add(output);
        frame.add(show);
        frame.add(mark);
        frame.add(unmark);
        frame. setSize (420 , 350);
        frame. setVisible (true);
        frame. setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE );
    }
}