package task5.port.classes;

import task5.port.classes.ContainerVolume;

public class ContainerWeight extends ContainerVolume {
    private final double LOW_DENSITY = 1000;
    private final double HIGH_DENSITY = 2000;

    public double getLOW_DENSITY() {
        return LOW_DENSITY;
    }

    public double getHIGH_DENSITY() {
        return HIGH_DENSITY;
    }
    //масса маленького контейнера
    public double smallContainerWeight(double shapeVolume) {
        double weight = getLOW_DENSITY() * shapeVolume;
        return weight;
    }
    //масса большого контейнера
    public double bigContainerWeight(double shapeVolume) {
        double weight = getHIGH_DENSITY() * shapeVolume;
        return weight;
    }

}
