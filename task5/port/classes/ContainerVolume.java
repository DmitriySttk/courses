package task5.port.classes;

import task5.port.interfaces.ConeVolume;
import task5.port.interfaces.CuboidVolume;
import task5.port.interfaces.CylinderVolume;
import task5.port.interfaces.Dice;

public class ContainerVolume implements ConeVolume, CuboidVolume, CylinderVolume, Dice {

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

    //рандом 1-2
    public int rollOneToTwo() {
        int roll = (int) (Math.random() * 2 + 1);
        return roll;
    }

    //рандом 1-3
    public int rollOneToThree() {
        int roll = (int) (Math.random() * 3 + 1);
        return roll;
    }
}
