package task11.iostreams;

import task10.stream.Cpu;

public class MainInOutStreams {
    public static void main(String[] args) throws Exception {
        ProductCollection testCol = new ProductCollection();
        for (int i = 0; i < 3; i++) {
            testCol.addProduct();
        }
        testCol.printCol();
    }
}
