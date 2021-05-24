package javaee.bookstore;

import java.util.ArrayList;

public class Stock implements javaee.bookstore.interfaces.Stock {

    ArrayList<Book> stock = new ArrayList<>();


    @Override
    public void addd(String name, String edition, double price, boolean isInStock) {
        Book book = new Book(name, edition, price, isInStock);
        stock.add(book);
    }

    @Override
    public void sort() {

    }
}
