package task11.iostreams;

public class MainInOutStreams {
    public static void main(String[] args) throws Exception {
        ProductCollection testCol = new ProductCollection();
        OrderCollection testOrder = new OrderCollection();
        for (int i = 0; i < 3; i++) {
            testCol.addProduct();
        }
        testCol.printCol();
        testCol.save("task11\\iostreams\\productList");
        //  testCol.removeProduct();
        //  testCol.printCol();
        testCol.createCollectionFromFile();

    }
}
