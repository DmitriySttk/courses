package task6.robots.classes;

import task6.robots.enums.RobotBody;
import task6.robots.enums.RobotHead;
import task6.robots.interfaces.FinishedBody;

public class RobotsFactory extends Roll implements FinishedBody {
    HeadFactory head = new HeadFactory();

    @Override
    public Object finishedBody() {
        int roll = rollOneToThree();
        Object body = null;
        switch (roll) {
            case 1:
                body = (RobotBody.BIG);
                break;
            case 2:
                body = (RobotBody.MIDDLE);
                break;
            case 3:
                body = (RobotBody.SMALL);
                break;
        }
        return body;
    }
    public Object finishedHead(){
        return head.finishedHead();
    }
    class HeadFactory implements task6.robots.interfaces.FinishedHead {

        @Override
        public Object finishedHead() {
            int roll = rollOneToThree();
            Object head = null;
            switch (roll) {
                case 1:
                    head=(RobotHead.RED);
                    break;
                case 2:
                    head=(RobotHead.GREEN);
                    break;
                case 3:
                    head=(RobotHead.BLUE);
                    break;
            }
            return head;
        }
    }


}
