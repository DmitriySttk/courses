package task11.iostreams;

import task10.stream.Cpu;

import java.io.FileWriter;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ProductCollection {
    ArrayList<Product> ProductList = new ArrayList<Product>();
    Scanner in = new Scanner(System.in);
    public void addProduct() throws Exception {


        String name = in.next();
        int id = in.nextInt();

        ProductList.add(new Product(name,id,LocalDate.now()));


    }

    public void formOrder() throws Exception {

    }

    public void printCol(){
        List<Product> print = new ArrayList<>(ProductList);
        System.out.println(print);

    }
}


//всё фигня, замутить коллекцию, две коллекции для заказов и продуктов, переопределять тустринг и каждый раз перезаписывать текстовые файлы
//подумать о более оптимальном способе