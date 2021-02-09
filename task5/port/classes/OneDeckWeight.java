package task5.port.classes;

public class OneDeckWeight extends BigAndSmallContainersSelect {
    //определят какими контейнерами будет заполнена палуба большими или маленькими и заполняет одну палубу
    public double waterInDeckWeight() {
        double resultWeight = 0;
        int rollContainerSize = rollOneToTwo();     //containers size select
        if (rollContainerSize == 1) {               //заполнение палубы маленькими контейнерами
            for (int i = 0; i < 4; i++) {           //на палубе 4 контейнера
                rollContainerSize = rollOneToTwo(); //выбор маленький-тяжелый/маленький/лёгкий
                if (rollContainerSize == 1) {
                    resultWeight = resultWeight + smallAndLightContainerWeightSelect(rollOneToThree());
                }
                if (rollContainerSize == 2) {
                    resultWeight = resultWeight + smallAndHeavyContainerWeightSelect(rollOneToThree());
                }
                //  System.out.println(resultWeight + " лёгкий контейнер" + i);
            }
        }
        if (rollContainerSize == 2) {               //заполнение палубы большими контейнерами
            for (int i = 0; i < 2; i++) {           //2 штуки на палубе
                rollContainerSize = rollOneToTwo(); //выбор большие-лёгкие/большие-тяжелые
                if (rollContainerSize == 1) {
                    resultWeight = resultWeight + bigAndLightContainerWeightSelect(rollOneToThree());
                }
                if (rollContainerSize == 2) {
                    resultWeight = resultWeight + bigAndHeavyContainerWeightSelect(rollOneToThree());
                }
                //   System.out.println(resultWeight + " тяжелый контейнер" + i);
            }
        }
        return resultWeight;
    }

}
