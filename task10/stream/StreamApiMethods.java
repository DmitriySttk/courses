package task10.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMethods {
    Collection<Cpu> CpuList = Arrays.asList(new Cpu("Athlon", 1.5),
            new Cpu("Celeron", 1.5),
            new Cpu("Sempron", 1.5),
            new Cpu("Athlon", 3.5),
            new Cpu("Intel", 2),
            new Cpu("Atmega8", 0.001),
            new Cpu("STM32", 0.48),
            new Cpu("Ryzen", 3.5),
            new Cpu("Intel", 3),
            new Cpu("Athlon", 3));

    public void streamTest(){

        List<Cpu> test = CpuList.stream().filter((p)->p.getFrequency()>=2).collect(Collectors.toList());
        System.out.println("2+ GHz: " +test );
    }
}
