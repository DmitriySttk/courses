package task11.iostreams;

import java.io.FileWriter;
import java.time.LocalDate;

public class Writer  {
    public void addProduct() throws Exception {
        FileWriter addProduct = new FileWriter("D:\\java\\courses\\task11\\iostreams\\orderList");
        addProduct.write(String.valueOf(new Product("Snowflake",1, LocalDate.now())));
        addProduct.close();
    }

    public void formOrder() throws Exception {

    }
}
