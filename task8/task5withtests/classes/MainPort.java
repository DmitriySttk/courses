package task8.task5withtests.classes;

public class MainPort {
    public static void main(String[] args) {
        ShipsAreComing port = new ShipsAreComing();

        port.show(port.arrival());
        port.showTotalWeight();
    }
}
