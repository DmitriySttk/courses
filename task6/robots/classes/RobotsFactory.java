package task6.robots.classes;

import task6.robots.enums.RobotBody;
import task6.robots.enums.RobotHead;
import task6.robots.interfaces.FinishedBody;

public class RobotsFactory extends Roll implements FinishedBody {
    public Object robotBody = null;
    public Object robotHead = null;

    public Object getRobotBody() {
        return robotBody;
    }

    public void setRobotBody(Object robotBody) {
        this.robotBody = robotBody;
    }

    public Object getRobotHead() {
        return robotHead;
    }

    public void setRobotHead(Object robotHead) {
        this.robotHead = robotHead;
    }

    @Override
    public void finishedBody() {
        int roll = rollOneToThree();
        switch (roll) {
            case 1:
                setRobotBody(RobotBody.BIG);
                break;
            case 2:
                setRobotBody(RobotBody.MIDDLE);
                break;
            case 3:
                setRobotBody(RobotBody.SMALL);
                break;
        }

    }

    class HeadFactory implements task6.robots.interfaces.FinishedHead {

        @Override
        public void finishedHead() {
            int roll = rollOneToThree();
            switch (roll) {
                case 1:
                    setRobotHead(RobotHead.RED);
                    break;
                case 2:
                    setRobotHead(RobotHead.GREEN);
                    break;
                case 3:
                    setRobotHead(RobotHead.BLUE);
                    break;
            }

        }
    }


}
