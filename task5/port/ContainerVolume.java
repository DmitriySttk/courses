package task5.port;

import task5.port.interfaces.ConeVolume;
import task5.port.interfaces.CuboidVolume;
import task5.port.interfaces.CylinderVolume;

public class ContainerVolume implements ConeVolume, CuboidVolume, CylinderVolume {


    public double coneVolume(double height, double diagonal) {
        double coneVolume = height/3*Math.PI*Math.pow((diagonal/2),2);
        return coneVolume;
    }
    public double cuboidVolume(double height, double diagonal) {
        double cuboidVolume = (Math.pow(diagonal,2)/2)*height;
        return cuboidVolume;
    }
    public double cylinderVolume(double height, double diagonal){
        double cylinderVolume = Math.PI*Math.pow((diagonal/2),2)*height;
        return cylinderVolume;
    }
}
