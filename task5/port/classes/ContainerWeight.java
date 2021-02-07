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

    public double smallConeContainerWeight(double shape) {
        double weight = getLOW_DENSITY() * shape;
        return weight;
    }

    public double bigConeContainerWeight(double shape) {
        double weight = getHIGH_DENSITY() * shape;
        return weight;
    }

}
