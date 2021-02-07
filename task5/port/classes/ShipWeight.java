package task5.port.classes;

public class ShipWeight extends OneDeckWeight {
    public double OneDeckShipWaterWeight (){
        double resultWeight = waterInDeckWeight();
        return resultWeight;
    }
    public double twoDecksShipWaterWeight(){
        double firstDeck = waterInDeckWeight();
        double secondDeck = waterInDeckWeight();
        double resultWeight = firstDeck+secondDeck;
        return resultWeight;
    }
}
