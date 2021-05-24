package javase.task6.robots.classes;

import javase.task6.robots.interfaces.DiceRoll;

public class Roll implements DiceRoll {

    @Override
    public int rollOneToThree() {
        int roll = (int) (Math.random() * 3 + 1);
        return roll;
    }
}
