package task5.port.classes;

public class OneDeckWeight extends BigAndSmallContainersSelect {

    public double waterInDeckWeight() {
        double resultWeight = 0;
        int rollContainerSize = rollOneToTwo(); //containers size select
        if (rollContainerSize == 1) {
            for (int i = 0; i < 4; i++) {
                resultWeight = resultWeight + smallContainerWeightSelect(rollOneToThree());
//                System.out.println(resultWeight + " " + i);
            }
        }
        if (rollContainerSize == 2) {
            for (int i = 0; i < 2; i++) {
                resultWeight = resultWeight + bigContainerWeightSelect(rollOneToThree());
//                System.out.println(resultWeight + " " + i);
            }
        }
        return resultWeight;
    }

}
