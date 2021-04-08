package task11.iostreams;

import java.time.LocalDate;
import java.util.Scanner;

public class Product {
    private String name;
    private int id;
    private int dateOfManufacture;

    public Product(String name, int id, int dateOfManufacture) {
        this.name = name;
        this.id = id;
        this.dateOfManufacture = dateOfManufacture;
    }


    public Product() {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dateOfManufacture=" + dateOfManufacture +
                '}';
    }
}
