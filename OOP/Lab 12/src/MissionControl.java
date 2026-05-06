import java.util.*;

public class MissionControl {
    ArrayList<Superhero> heroes = new ArrayList<>();

    void addHero(Superhero h) {
        heroes.add(h);
    }

    String sendHero(String name) {
        for (Superhero h : heroes) {
            if (h.getName().equalsIgnoreCase(name)) {
                if (h.isOnMission()) {
                    return name + " is already on a mission!";
                }
                h.sendOnMission();
                return name + " has been sent on a mission.";
            }
        }
        return "Superhero '" + name + "' not found!";
    }

    String recallHero(String name) {
        for (Superhero h : heroes) {
            if (h.getName().equalsIgnoreCase(name)) {
                if (!h.isOnMission()) {
                    return name + " is already at the base!";
                }
                h.recallToBase();
                return name + " has been recalled to base.";
            }
        }
        return "Superhero '" + name + "' not found!";
    }

    String showActiveMissions() {
        String result = "";
        for (Superhero h : heroes) {
            if (h.isOnMission()) {
                result += h.getName() + "\n";
            }
        }
        if (result.equals("")) {
            return "No superheroes are currently on a mission.";
        }
        return "Heroes on Active Missions:\n" + result;
    }
}