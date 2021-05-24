package javase.task5.port.classes;

public class MainPort {
    public static void main(String[] args) {
        ShipsAreComing port = new ShipsAreComing();

        port.show(port.arrival());
        port.showTotalWeight();
    }
}
