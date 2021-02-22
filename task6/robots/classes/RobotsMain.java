package task6.robots.classes;

public class RobotsMain {
    public static void main(String[] args) {
        AssemblyLine makeRobot = new AssemblyLine();
        for (int i = 1; i < 10; i++) {
            System.out.println("Robot Mark" + i + " " + makeRobot.robot());
        }
    }
}
