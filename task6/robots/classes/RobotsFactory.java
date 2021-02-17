package task6.robots.classes;

import task6.robots.enums.RobotBody;
import task6.robots.interfaces.FinishedBody;
import task6.robots.interfaces.FinishedHead;

public class RobotsFactory extends Roll implements FinishedBody, FinishedHead {

    @Override
    public Object finishedBody(int roll) {
        roll = rollOneToThree();
        Object size = null;
        switch (roll) {
            case 1:
                size = RobotBody.BIG;
                return size;
            case 2:
                size = RobotBody.MIDDLE;
                return size;
            case 3:
                size = RobotBody.SMALL;
                return size;
        }

        return size;
    }

    @Override
    public Object finishedHead(int roll) {
        return null;
    }
}
