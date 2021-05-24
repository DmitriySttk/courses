package javase.task8.task5withtests.classes;

public class BigAndSmallContainersSelect extends ContainerWeight {
    //подумать как можно сократить дублирующийся по сути код
    //масса маленького контейнера конкретной формы, принимает ролл 1-3, выдаёт массу
    public double smallAndLightContainerWeightSelect(int rollOneToThree) {
        double selectedWeight = 0;
        switch (rollOneToThree) {
            case 1:
                selectedWeight = lightContainerWeight(coneVolume(rollTenToHundred(), smallDiagonal));
                break;
            case 2:
                selectedWeight = lightContainerWeight(cuboidVolume(rollTenToHundred(), smallDiagonal));
                break;
            case 3:
                selectedWeight = lightContainerWeight(cylinderVolume(rollTenToHundred(), smallDiagonal));

        }
        return selectedWeight;
    }

    //масса тяжёлого маленького
    public double smallAndHeavyContainerWeightSelect(int rollOneToThree) {
        double selectedWeight = 0;
        switch (rollOneToThree) {
            case 1:
                selectedWeight = heavyContainerWeight(coneVolume(rollTenToHundred(), smallDiagonal));
                break;
            case 2:
                selectedWeight = heavyContainerWeight(cuboidVolume(rollTenToHundred(), smallDiagonal));
                break;
            case 3:
                selectedWeight = heavyContainerWeight(cylinderVolume(rollTenToHundred(), smallDiagonal));

        }
        return selectedWeight;
    }

    //масса большого тяжелого контейнера конкретной формы
    public double bigAndHeavyContainerWeightSelect(int rollOneToThree) {
        double selectedWeight = 0;
        switch (rollOneToThree) {
            case 1:
                selectedWeight = heavyContainerWeight(coneVolume(rollTenToHundred(), bigDiagonal));
                break;
            case 2:
                selectedWeight = heavyContainerWeight(cuboidVolume(rollTenToHundred(), bigDiagonal));
                break;
            case 3:
                selectedWeight = heavyContainerWeight(cylinderVolume(rollTenToHundred(), bigDiagonal));

        }
        return selectedWeight;
    }

    //масса большого лёгкого
    public double bigAndLightContainerWeightSelect(int rollOneToThree) {
        double selectedWeight = 0;
        switch (rollOneToThree) {
            case 1:
                selectedWeight = lightContainerWeight(coneVolume(rollTenToHundred(), bigDiagonal));
                break;
            case 2:
                selectedWeight = lightContainerWeight(cuboidVolume(rollTenToHundred(), bigDiagonal));
                break;
            case 3:
                selectedWeight = lightContainerWeight(cylinderVolume(rollTenToHundred(), bigDiagonal));

        }
        return selectedWeight;
    }

}
