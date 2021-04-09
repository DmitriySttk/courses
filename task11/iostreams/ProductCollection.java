package task11.iostreams;

import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductCollection {
    ArrayList<CommonParameters> productList = new ArrayList<CommonParameters>();
    Scanner in = new Scanner(System.in);
    ArrayList<String> tempArray = new ArrayList<>();

    public void addProduct() throws Exception {
        try {
            System.out.println("Enter product name");
            String name = in.next();
            System.out.println("Enter product ID");
            String id = in.next();

            productList.add(new CommonParameters(name, id, LocalDate.now()));
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
        List<CommonParameters> print = new ArrayList<>(productList);
        System.out.println(print);
    }


    public void save(String filepath) throws FileNotFoundException {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filepath, true));
            for (CommonParameters commonParameters : productList)
                pw.println(commonParameters);
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

    public void createCollectionFromFile() throws IOException {
        File myFile = new File("task11\\iostreams\\productList");
        FileReader fr = new FileReader(myFile);
        BufferedReader reader = new BufferedReader(fr);
        String line;
        String[] name;
        while ((line = reader.readLine()) != null) {
            tempArray.add(line);
            name = line.split("/");
        }
        reader.close();

        //для тестового вывода
//        for (String s :
//                tempArray) {
//            System.out.println(s);
//        }

    }
}


//всё фигня, замутить коллекцию, две коллекции для заказов и продуктов, переопределять тустринг и каждый раз перезаписывать текстовые файлы
//подумать о более оптимальном способе
//при запуске первым делом создавать коллекцию из файла