package task5.port.classes;

public class MainPort {
    public static void main(String[] args) {
        BigAndSmallContainersSelect weight = new BigAndSmallContainersSelect();
        DiceRoll roll = new DiceRoll();
        System.out.println(weight.smallContainerWeightSelect(roll.rollOneToThree()));
    }
}
