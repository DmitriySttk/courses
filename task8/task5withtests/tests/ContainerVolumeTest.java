package task8.task5withtests.tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task8.task5withtests.classes.ContainerVolume;

public class ContainerVolumeTest {
    ContainerVolume volume = new ContainerVolume();

    @Test
    void when6And8Then100ConeVolume(){
        Assertions.assertEquals(100.53096491487338,volume.coneVolume(6,8));
    }
    @Test
    void when6And8Then192CuboidVolume(){
        Assertions.assertEquals(192.0,volume.cuboidVolume(6,8));
    }
    @Test
    void when6And8Then300CylinderVolume(){
        Assertions.assertEquals(301.59289474462014,volume.cylinderVolume(6,8));
    }


}
