package javase.task8.task5withtests.tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import javase.task8.task5withtests.classes.ContainerVolume;

public class ContainerVolumeTest {
    ContainerVolume volume = new ContainerVolume();

    @Test
    void when6And8Then100ConeVolume() {
        Assertions.assertEquals(100.53096491487338, volume.coneVolume(6, 8));
    }

    @Test
    void when6And8Then192CuboidVolume() {
        Assertions.assertEquals(192.0, volume.cuboidVolume(6, 8));
    }

    @Test
    void when6And8Then300CylinderVolume() {
        Assertions.assertEquals(301.59289474462014, volume.cylinderVolume(6, 8));
    }
    @RepeatedTest(10)
    void OneToTwoTest(){
        Assertions.assertNotEquals(1,volume.rollOneToTwo());
    }

    @RepeatedTest(10)
    void testForRandomOneToTwo() {
        int i = volume.rollOneToTwo();
        if (i < 1 || i > 2) {
            System.out.println("not noice");
        }
        else System.out.println("noiiice");
    }
    @RepeatedTest(10)
    void testForRandomOneToThree() {
        int i = volume.rollOneToThree();
        if (i < 1 || i > 3) {
            System.out.println("not noice");
        }
        else System.out.println("noiiice");
    }
    @RepeatedTest(10)
    void testForTenToHundred() {
        int i = volume.rollTenToHundred();
        if (i < 10 || i > 100) {
            System.out.println("not noice");
        }
        else System.out.println("noiiice");
    }


}
