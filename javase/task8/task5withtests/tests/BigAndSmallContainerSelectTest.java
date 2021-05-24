package javase.task8.task5withtests.tests;

import org.junit.jupiter.api.RepeatedTest;


import javase.task8.task5withtests.classes.BigAndSmallContainersSelect;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigAndSmallContainerSelectTest {
    BigAndSmallContainersSelect select = new BigAndSmallContainersSelect();



    @RepeatedTest(10)
    void iDontKnowWTF() {
        assertEquals(10, select.smallAndLightContainerWeightSelect(1));
    }

}

