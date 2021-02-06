package task5.port;

import task5.port.interfaces.ConeVolume;
import task5.port.interfaces.CuboidVolume;
import task5.port.interfaces.CylinderVolume;

public class ContainerShape implements ConeVolume, CuboidVolume, CylinderVolume {
    private final double DENSITY_LOW = 1000;
    private final double DENSITY_HIGH = 2000;


    public double coneVolume(double height, double diagonal) {

        return 0;
    }
}
