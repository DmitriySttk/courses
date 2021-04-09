package task11.iostreams;

import java.time.LocalDate;

public class MainInOutStreams {
    public static void main(String[] args) throws Exception {
        ProductCollection testCol = new ProductCollection();
        for (int i = 0; i < 3; i++) {
            testCol.addProduct();
        }
        testCol.printCol();
        testCol.save("task11\\iostreams\\productList");
      //  testCol.removeProduct();
      //  testCol.printCol();
    }
}
