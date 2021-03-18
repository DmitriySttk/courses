package task10.stream;

import java.util.Collection;

public class StreamMain {
    public static void main(String[] args) {
        CpuList cpu = new CpuList();
        Collection<String> collection = cpu.myCpuList;
      //  Stream streamFromCollection = (Stream) collection.stream();
        System.out.println(cpu);
    }

}
