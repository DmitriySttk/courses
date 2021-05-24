package javase.task8.task5withtests.classes;

public class ContainerWeight extends ContainerVolume {
    private final double LOW_DENSITY = 1000;
    private final double HIGH_DENSITY = 2000;

    public double getLOW_DENSITY() {
        return LOW_DENSITY;
    }

    public double getHIGH_DENSITY() {
        return HIGH_DENSITY;
    }

    //масса лёгкого контейнера
    public double lightContainerWeight(double shapeVolume) {
        double weight = getLOW_DENSITY() * shapeVolume;
        return weight;
    }

    //масса тяжелого контейнера
    public double heavyContainerWeight(double shapeVolume) {
        double weight = getHIGH_DENSITY() * shapeVolume;
        return weight;
    }

}
