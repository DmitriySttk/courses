package task10.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMethods {
    Collection<Cpu> cpuList = Arrays.asList(
            new Cpu("Athlon", 1.5),
            new Cpu("Athlon", 1.5),
            new Cpu("Athlon", 1.5),
            new Cpu("Athlon", 1.5),
            new Cpu("Athlon", 1.5),
            new Cpu("Celeron", 1.5),
            new Cpu("Sempron", 1.5),
            new Cpu("Athlon", 3.5),
            new Cpu("Intel", 2),
            new Cpu("Atmega8", 0.001),
            new Cpu("STM32", 0.48),
            new Cpu("Ryzen", 3.5),
            new Cpu("Intel", 3),
            new Cpu("Athlon", 1.5));

    public void streamFilter() {
        List<Cpu> filter = cpuList.stream()
                .filter((p) -> p.getFrequency() >= 2)
                .collect(Collectors.toList());

        System.out.println("2+ GHz: " + filter);
    }

    public void streamSkip() {
        List<Cpu> skip = cpuList.stream()
                .skip(7)
                .collect(Collectors.toList());

        System.out.println("skip 7 " + skip);
    }

    public void streamDistinct() {
        List<Cpu> distinct = cpuList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("distinct " + distinct);
    }

    public void streamMap() {
        List<String> cpuNames = new ArrayList<>();  //для примера
        for (Cpu cpu : cpuList) {                   //замена стрима на цикл
            String name = cpu.getName();            //
            cpuNames.add(name);                     //
        }                                           //
        System.out.println(cpuNames);               //

        List<Double> cpuFreq = cpuList.stream()
                .map(Cpu::getFrequency)
                .collect(Collectors.toList());
        System.out.println(cpuFreq);
    }

    public void streamPeek() {

        List<String> peek = cpuList.stream()
                .map(Cpu::getName).peek((e) -> System.out.print("---" + e))
                .collect(Collectors.toList());

    }

}
