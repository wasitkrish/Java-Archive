public class Superhero {
    String name;
    boolean onMission;

    Superhero(String n) {
        name = n;
        onMission = false;
    }

    void sendOnMission() {
        onMission = true;
    }

    void recallToBase() {
        onMission = false;
    }

    boolean isOnMission() {
        return onMission;
    }

    String getName() {
        return name;
    }
}