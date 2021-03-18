package task10.stream;

import java.util.ArrayList;

public class CpuList {
    ArrayList myCpuList = new ArrayList();

    public void col() {
        myCpuList.add(new Cpu("Athlon", 1.5));
        myCpuList.add(new Cpu("Celeron", 1.5));
        myCpuList.add(new Cpu("Sempron", 1.5));
        myCpuList.add(new Cpu("Athlon", 3.5));
        myCpuList.add(new Cpu("Intel", 2));
        myCpuList.add(new Cpu("Atmega8", 0.001));
        myCpuList.add(new Cpu("STM32", 0.48));
        myCpuList.add(new Cpu("Ryzen", 3.5));
        myCpuList.add(new Cpu("Intel", 3));
        myCpuList.add(new Cpu("Athlon", 3));

    }


}
