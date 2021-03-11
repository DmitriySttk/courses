package task8.task5withtests.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import task8.task5withtests.classes.BigAndSmallContainersSelect;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigAndSmallContainerSelectTest {
    BigAndSmallContainersSelect select = new BigAndSmallContainersSelect();



    @RepeatedTest(10)
    void iDontKnowWTF() {
        assertEquals(10, select.smallAndLightContainerWeightSelect(1));
    }

}

