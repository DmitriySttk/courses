package javase.task8.task5withtests.classes;

import javase.task8.task5withtests.interfaces.*;

public class ContainerVolume implements ConeVolume, CuboidVolume, CylinderVolume, Dice, Diagonal {

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

    //высота 10-100
    public int rollTenToHundred() {
        int roll = (int) (Math.random() * 90 + 10);
        return roll;
    }
}
