package task11.iostreams;

import task10.stream.Cpu;

import java.io.FileWriter;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ProductCollection {
    ArrayList<Product> ProductList = new ArrayList<Product>();

    public void addProduct() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("test");
        String name = in.next();
        System.out.println("after");
        ProductList.add(new Product(name,123,1));
        System.out.println("after add");

    }

    public void formOrder() throws Exception {

    }

    public void printCol(){
        List<Product> print = ProductList.stream()
                .collect(Collectors.toList());
        System.out.println(print);
    }
}


//всё фигня, замутить коллекцию, две коллекции для заказов и продуктов, переопределять тустринг и каждый раз перезаписывать текстовые файлы
//подумать о более оптимальном способе