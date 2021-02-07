package task5.port.classes;

import task5.port.interfaces.Dice;

public class DiceRoll implements Dice {
    public int rollOneToTwo() {
        int roll = (int) (Math.random() * 2 + 1);
        return roll;
    }

    public int rollOneToThree() {
        int roll = (int) (Math.random() * 3 + 1);
        return roll;

    }
}
