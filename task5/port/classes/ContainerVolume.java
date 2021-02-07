package task5.port.classes;

import task5.port.interfaces.ConeVolume;
import task5.port.interfaces.CuboidVolume;
import task5.port.interfaces.CylinderVolume;

public class ContainerVolume implements ConeVolume, CuboidVolume, CylinderVolume {

    //объём конуса
    public double coneVolume(double height, double diagonal) {
        double coneVolume = height / 3 * Math.PI * Math.pow((diagonal / 2), 2);
        return coneVolume;
    }
    //объём прямоугольного параллелепипеда
    public double cuboidVolume(double height, double diagonal) {
        double cuboidVolume = (Math.pow(diagonal, 2) / 2) * height;
        return cuboidVolume;
    }
    //объём цилиндра
    public double cylinderVolume(double height, double diagonal) {
        double cylinderVolume = Math.PI * Math.pow((diagonal / 2), 2) * height;
        return cylinderVolume;
    }
}
