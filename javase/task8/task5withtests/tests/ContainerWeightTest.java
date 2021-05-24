package javase.task8.task5withtests.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import javase.task8.task5withtests.classes.ContainerWeight;

public class ContainerWeightTest {
    ContainerWeight weight = new ContainerWeight();

    @Test
    void when1then1000LightContainerWeight(){
        Assertions.assertEquals(1000, weight.lightContainerWeight(1));
    }

    @Test
    void when1then2000HeavyContainerWeight(){
        Assertions.assertEquals(2000, weight.heavyContainerWeight(1));
    }
}
