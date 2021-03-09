package task8.task5withtests.tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task8.task5withtests.classes.ContainerVolume;

public class ContainerVolumeTest {
    ContainerVolume volume = new ContainerVolume();

    @Test
    void whenSixAndEightThenHundredConeVolume(){
        Assertions.assertEquals(100.53096491487338,volume.coneVolume(6,8));
    }


}
