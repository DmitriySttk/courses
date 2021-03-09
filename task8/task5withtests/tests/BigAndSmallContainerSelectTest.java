package task8.task5withtests.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import task8.task5withtests.classes.BigAndSmallContainersSelect;

public class BigAndSmallContainerSelectTest {
    BigAndSmallContainersSelect select = new BigAndSmallContainersSelect();

    @RepeatedTest(10)
    void iDontKnowWTF(){
        Assertions.assertEquals(10,select.smallAndLightContainerWeightSelect(1));
    }
}
