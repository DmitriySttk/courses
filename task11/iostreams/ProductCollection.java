package task11.iostreams;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductCollection {
    ArrayList<Product> productList = new ArrayList<Product>();
    Scanner in = new Scanner(System.in);

    public void addProduct() throws Exception {
        try {
            System.out.println("Enter product name");
            String name = in.next();
            System.out.println("Enter product ID");
            String id = in.next();

            productList.add(new Product(name, id, LocalDate.now()));
        } catch (Exception ex) {
            System.out.println("something went wrong");
        }
    }

    public void removeProduct() {
        System.out.println("Enter product ID to remove");
        String id = in.next();
        productList.removeIf(nextProd -> nextProd.getId().equalsIgnoreCase(id));
//        Iterator<Product> productIterator = productList.iterator();       //это заменило стройкой выше
//        while (productIterator.hasNext()){                                //уделить внимание, разобраться получше
//            Product nextProd = productIterator.next();
//            if(nextProd.getId().equalsIgnoreCase(id)){
//                productIterator.remove();
//            }
    }

    public void printCol() {
        List<Product> print = new ArrayList<>(productList);
        System.out.println(print);
    }


    public void save(String filepath) throws FileNotFoundException {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filepath, true));
            for (Product product : productList)
                pw.println(product);
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearFile(String filepath) throws FileNotFoundException {
        try {
            PrintWriter writer = new PrintWriter(filepath);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


//всё фигня, замутить коллекцию, две коллекции для заказов и продуктов, переопределять тустринг и каждый раз перезаписывать текстовые файлы
//подумать о более оптимальном способе