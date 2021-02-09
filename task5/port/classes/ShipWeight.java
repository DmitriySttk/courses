package task5.port.classes;

public class ShipWeight extends OneDeckWeight {
    //возвращает вес одной палубы
    public double oneDeckShipWaterWeight() {
        double resultWeight = waterInDeckWeight();
        return resultWeight;
    }

    //возвращает вес двух палуб заполненных по отдельности (полпятого утра, хочется в это верить)
    public double twoDecksShipWaterWeight() {
        double firstDeck = waterInDeckWeight();
        double secondDeck = waterInDeckWeight();
        double resultWeight = firstDeck + secondDeck;
        return resultWeight;
    }
}
