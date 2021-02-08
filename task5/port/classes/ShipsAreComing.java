package task5.port.classes;

public class ShipsAreComing extends ShipWeight {
    double[] ships = new double[10];

    public double[] arrival() {
        for (int i = 0; i < ships.length; i++) {
            int randomShip = rollOneToTwo();
            if (randomShip == 1) {
                ships[i] = oneDeckShipWaterWeight();
            }
            if (randomShip == 2) {
                ships[i] = twoDecksShipWaterWeight();
            }
        }
        return ships;
    }

    public void show(double[] ships) {
        for (int i = 0; i < ships.length; i++) {
            System.out.println(i + 1 + " ship contains " + ships[i]);
        }
        System.out.println();
    }

    public void showTotalWeight() {
        int totalResult = 0;
        double totalResultDouble = 0;
        for (int i = 0; i < ships.length; i++) {
            totalResult = (int) (totalResult + ships[i]);
            totalResultDouble = (totalResultDouble + ships[i]);
        }
        System.out.println("total weight = " + totalResultDouble);
        System.out.println("total weight cast to int = " + totalResult);
    }
}
