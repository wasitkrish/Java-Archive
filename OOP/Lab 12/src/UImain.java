import javax.swing.*;

public class UImain {

    public UImain(MissionControl sys) {
        JFrame frame = new JFrame("Superhero Mission Control");
        frame.setLayout(null);

        // Label for input
        JLabel inputLabel = new JLabel("Enter Superhero Name:");
        inputLabel.setBounds(50, 20, 200, 25);

        // Input field
        JTextField input = new JTextField();
        input.setBounds(50, 50, 200, 30);

        // Output area
        JTextArea output = new JTextArea();
        output.setBounds(50, 100, 300, 120);
        output.setEditable(false);
        output.setLineWrap(true);

        // Buttons
        JButton showBtn = new JButton("Show Active Missions");
        JButton sendBtn = new JButton("Send on Mission");
        JButton recallBtn = new JButton("Recall to Base");

        showBtn.setBounds(50, 240, 180, 30);
        sendBtn.setBounds(50, 280, 180, 30);
        recallBtn.setBounds(50, 320, 180, 30);

        // Button Actions
        showBtn.addActionListener(e ->
                output.setText(sys.showActiveMissions())
        );

        sendBtn.addActionListener(e ->
                output.setText(sys.sendHero(input.getText().trim()))
        );

        recallBtn.addActionListener(e ->
                output.setText(sys.recallHero(input.getText().trim()))
        );

        // Add all components
        frame.add(inputLabel);
        frame.add(input);
        frame.add(output);
        frame.add(showBtn);
        frame.add(sendBtn);
        frame.add(recallBtn);

        frame.setSize(420, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}