import java.util.*;
import java.awt.*;
import javax.swing.*;

class LitterReport {
    String location;
    String type;
    int count;

    LitterReport(String l, String t) {
        location = l;
        type = t;
        count = 0;
    }

    void addCount(int value) {
        count += value;
    }

    String getLocation() {
        return location;
    }

    String getType() {
        return type;
    }

    int getCount() {
        return count;
    }
}

class LitterSystem {
    ArrayList<LitterReport> list = new ArrayList<>();

    String addReport(String location, String type, int value) {
        for (LitterReport l : list) {
            if (l.getLocation().equals(location) && l.getType().equals(type)) {
                l.addCount(value);
                return "Report Updated";
            }
        }
        list.add(new LitterReport(location, type));
        list.get(list.size() - 1).addCount(value);
        return "New Report Added";
    }

    String showHighReports(int threshold) {
        StringBuilder res = new StringBuilder();

        for (LitterReport s : list) {
            if (s.getCount() >= threshold) {
                res.append("Location: ")
                        .append(s.getLocation())
                        .append(" | Type: ")
                        .append(s.getType())
                        .append(" | Count: ")
                        .append(s.getCount())
                        .append("\n");
            }
        }

        if (res.length() == 0) {
            return "No location above threshold";
        }
        return res.toString();
    }
}

public class Main {
    public static void main(String[] args) {

        LitterSystem system = new LitterSystem();

        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("Litter Reports");
            frame.setLayout(new FlowLayout());

            JLabel title = new JLabel("Entry System");

            JTextField location = new JTextField(10);
            JTextField type = new JTextField(10);
            JTextField value = new JTextField(5);

            JTextArea output = new JTextArea(10, 30);
            output.setEditable(false);

            JButton add = new JButton("ADD");
            JButton disp = new JButton("DISPLAY");

            // ADD button logic
            add.addActionListener(e -> {
                String loc = location.getText();
                String t = type.getText();

                int vall;
                try {
                    vall = Integer.parseInt(value.getText());
                } catch (Exception ex) {
                    output.setText("Invalid count value");
                    return;
                }

                String result = system.addReport(loc, t, vall);
                output.setText(result);
            });

            // DISPLAY button logic
            disp.addActionListener(e -> {
                output.setText(system.showHighReports(5));
            });

            frame.add(title);
            frame.add(new JLabel("Location:"));
            frame.add(location);
            frame.add(new JLabel("Type:"));
            frame.add(type);
            frame.add(new JLabel("Count:"));
            frame.add(value);
            frame.add(add);
            frame.add(disp);
            frame.add(new JScrollPane(output));

            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}