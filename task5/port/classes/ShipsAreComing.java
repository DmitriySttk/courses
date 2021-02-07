package task5.port.classes;

public class ShipsAreComing extends ShipWeight {
    public double[] arrival() {
        double[] ships = new double[10];

        for (int i = 0; i < ships.length; i++) {
            int randomShip = rollOneToTwo();
            if (randomShip == 1) {
                ships[i] = oneDeckShipWaterWeight();
            }
            if (randomShip == 2) {
                ships[i] = twoDecksShipWaterWeight();
            }
        }
//        for (int i = 0; i < ships.length; i++) {
//            System.out.println(i + 1 + " " + ships[i]);
//        }
        return ships;
    }

    public void show(double[] ships) {
        for (int i = 0; i < ships.length; i++) {
            System.out.println(i + 1 + " " + ships[i]);
        }
    }
}
