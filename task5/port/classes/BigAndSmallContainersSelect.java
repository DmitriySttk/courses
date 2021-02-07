package task5.port.classes;

public class BigAndSmallContainersSelect extends ContainerWeight {

//    public int diceRoll(int rollOnetoTwo) {
//        if (rollOnetoTwo == 1) {
//            return 1;
//        } else {
//            return 2;
//        }
//    }
    //масса маленького контейнера конкретной формы
    public double smallContainerWeightSelect(int rollOneToThree) {
        double selectedWeight = 0;
        switch (rollOneToThree) {
            case 1:
                selectedWeight = smallContainerWeight(coneVolume(Math.random() * 91 + 10, 10));
                break;
            case 2:
                selectedWeight = smallContainerWeight(cuboidVolume(Math.random() * 91 + 10, 10));
                break;
            case 3:
                selectedWeight = smallContainerWeight(cylinderVolume(Math.random() * 91 + 10, 10));

        }
        return selectedWeight;
    }
    //масса большого контейнера конкретной формы
    public double bigContainerWeightSelect(int rollOneToThree) {
        double selectedWeight = 0;
        switch (rollOneToThree) {
            case 1:
                selectedWeight = bigContainerWeight(coneVolume(Math.random() * 91 + 10, 20));
                break;
            case 2:
                selectedWeight = bigContainerWeight(cuboidVolume(Math.random() * 91 + 10, 20));
                break;
            case 3:
                selectedWeight = bigContainerWeight(cylinderVolume(Math.random() * 91 + 10, 20));

        }
        return selectedWeight;
    }

}
