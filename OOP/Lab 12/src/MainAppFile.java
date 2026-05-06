import javax.swing.*;
public class MainAppFile {
    public static void main(String[] args) {
        MissionControl sys = new MissionControl();
        sys.addHero(new Superhero("Batman"));
        sys.addHero(new Superhero("Spiderman"));
        sys.addHero(new Superhero("WonderWoman"));

        // Build GUI and connect system
        SwingUtilities.invokeLater(() -> new UImain(sys));
    }
}