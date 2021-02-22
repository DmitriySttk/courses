package task6.robots.classes;

public class AssemblyLine extends RobotsFactory {
//    Object robHead = finishedHead();
//    Object robBody = finishedBody();
//
//    @Override
//    public String toString() {
//        return "AssemblyLine{" +
//                "robHead=" + robHead +
//                ", robBody=" + robBody +
//                '}';
//    }

    public String robot() {
        Object robHead = finishedHead();
        Object robBody = finishedBody();
        return "{" +
                "Head=" + robHead +
                ", Body=" + robBody +
                '}';

    }


}
