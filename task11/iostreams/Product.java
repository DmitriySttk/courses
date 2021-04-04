package task11.iostreams;

import java.time.LocalDate;

public class Product {
    private String name;
    private int id;
    private LocalDate dateOfManufacture;

    public Product(String name, int id, LocalDate dateOfManufacture) {
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

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }
}
