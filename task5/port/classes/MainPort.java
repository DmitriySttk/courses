package task5.port.classes;

public class MainPort {
    public static void main(String[] args) {
        ShipsAreComing port = new ShipsAreComing();
        DiceRoll roll = new DiceRoll();
        port.arrival();
    }
}
