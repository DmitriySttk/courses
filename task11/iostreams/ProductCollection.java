package task11.iostreams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductCollection {
    ArrayList<Product> ProductList = new ArrayList<Product>();
    Scanner in = new Scanner(System.in);

    public void addProduct() throws Exception {
        try {
            System.out.println("Enter product name");
            String name = in.next();
            System.out.println("Enter product ID");
            String id = in.next();

            ProductList.add(new Product(name, id, LocalDate.now()));
        } catch (Exception ex) {
            System.out.println("something went wrong");
        }
    }

    public void removeProduct(){
        System.out.println("Enter product ID to remove");
        String id = in.next();
        Iterator<Product> productIterator = ProductList.iterator();
        while (productIterator.hasNext()){
            Product nextProd = productIterator.next();
            if(nextProd.getId().equalsIgnoreCase(id)){
                productIterator.remove();
            }
        }
    }

    public void printCol() {
        List<Product> print = new ArrayList<>(ProductList);
        System.out.println(print);
    }
}


//всё фигня, замутить коллекцию, две коллекции для заказов и продуктов, переопределять тустринг и каждый раз перезаписывать текстовые файлы
//подумать о более оптимальном способе