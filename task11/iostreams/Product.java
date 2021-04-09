package task11.iostreams;

import java.time.LocalDate;

public class Product {
    private String name;
    private String id;
    private LocalDate dateOfManufacture;

    public Product(String name, String id, LocalDate dateOfManufacture) {
        this.name = name;
        this.id = id;
        this.dateOfManufacture = dateOfManufacture;
    }


    public Product() {
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    @Override
    public String toString() {

        return name + "\\" + id + "\\" + dateOfManufacture;
    }

}
