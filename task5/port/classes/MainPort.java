package task5.port.classes;

public class MainPort {
    public static void main(String[] args) {
        OneDeckWeight weight = new OneDeckWeight();
        DiceRoll roll = new DiceRoll();
        System.out.println("fist ship"+weight.waterInDeckWeight(1));
    }
}
