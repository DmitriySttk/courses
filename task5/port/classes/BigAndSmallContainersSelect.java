package task5.port.classes;

public class BigAndSmallContainersSelect extends ContainerWeight {


    //масса маленького контейнера конкретной формы, принимает ролл 1-3, выдаёт массу
    //заменить Math.random на метод (мб ебануть интерфейс ещё, но это не точно. на счет диагонали то же самое)
    public double smallContainerWeightSelect(int rollOneToThree) {
        double selectedWeight = 0;
        switch (rollOneToThree) {
            case 1:
                selectedWeight = lightContainerWeight(coneVolume(rollTenToHundred(), 10));
                break;
            case 2:
                selectedWeight = lightContainerWeight(cuboidVolume(rollTenToHundred(), 10));
                break;
            case 3:
                selectedWeight = lightContainerWeight(cylinderVolume(rollTenToHundred(), 10));

        }
        return selectedWeight;
    }

    //масса большого контейнера конкретной формы
    public double bigContainerWeightSelect(int rollOneToThree) {
        double selectedWeight = 0;
        switch (rollOneToThree) {
            case 1:
                selectedWeight = heavyContainerWeight(coneVolume(rollTenToHundred(), 20));
                break;
            case 2:
                selectedWeight = heavyContainerWeight(cuboidVolume(rollTenToHundred(), 20));
                break;
            case 3:
                selectedWeight = heavyContainerWeight(cylinderVolume(rollTenToHundred(), 20));

        }
        return selectedWeight;
    }

}
