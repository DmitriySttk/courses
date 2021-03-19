package task10.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiMethods {
    Collection<Cpu> cpuList = Arrays.asList(
            new Cpu("Athlon", 1.5),
            new Cpu("Athlon", 1.5),
            new Cpu("Celeron", 1.5),
            new Cpu("Sempron", 1.5),
            new Cpu("Athlon", 3.5),
            new Cpu("Atmega8", 0.001),
            new Cpu("STM32", 0.48),
            new Cpu("Ryzen", 3.5),
            new Cpu("Intel", 3),
            new Cpu("Athlon", 1.5));

    public void cpuFilter() {
        List<Cpu> filter = cpuList.stream()
                .filter((p) -> p.getFrequency() >= 2)
                .collect(Collectors.toList());

        System.out.println("2+ GHz: " + filter);
    }

    public void cpuSkip() {
        List<Cpu> skip = cpuList.stream()
                .skip(7)
                .collect(Collectors.toList());

        System.out.println("skip 7 " + skip);
    }

    public void cpuDistinct() {
        List<Cpu> distinct = cpuList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("distinct " + distinct);
    }

    public void cpuMap() {
        List<String> cpuNames = new ArrayList<>();  //для примера
        for (Cpu cpu : cpuList) {                   //замена стрима на foreach
            String name = cpu.getName();            //
            cpuNames.add(name);                     //
        }                                           //
        System.out.println("map: " + cpuNames);     //

        List<Double> cpuFreq = cpuList.stream()
                .map(Cpu::getFrequency)
                .collect(Collectors.toList());
        System.out.println("map: " + cpuFreq);
    }

    public void cpuPeek() {

        List<String> peek = cpuList.stream()
                .map(Cpu::getName).peek((e) -> System.out.print("---" + e))
                .collect(Collectors.toList());
        System.out.println();
    }

    public void cpuLimit() {
        List<Cpu> limit = cpuList.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("limit: " + limit);
    }

    public void cpuSorted() {
        List<Cpu> sorted = cpuList.stream()
                // .filter(e -> e.getFrequency() < 2)
                .sorted(Comparator.comparingDouble(Cpu::getFrequency))
                .collect(Collectors.toList());
        System.out.println("Compare: " + sorted);
    }

//    class CpuComparator implements Comparator<Cpu> {
//
//        @Override
//        public int compare(Cpu a, Cpu b) {
//
//            return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
//        }


}
