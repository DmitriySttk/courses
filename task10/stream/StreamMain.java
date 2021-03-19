package task10.stream;

public class StreamMain {
    public static void main(String[] args) {
        StreamApiMethods cpuList = new StreamApiMethods();
        cpuList.cpuFilter();
        cpuList.cpuSkip();
        cpuList.cpuDistinct();
        cpuList.cpuMap();
        cpuList.cpuPeek();
        cpuList.cpuLimit();
        cpuList.cpuSorted();
    }

}
