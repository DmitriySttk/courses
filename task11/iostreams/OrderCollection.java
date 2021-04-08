package task11.iostreams;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrderCollection extends ProductCollection {
    ArrayList<Order> orderList = new ArrayList<Order>();

    public void addOrder(){
        System.out.println("Enter order name");
        String id = in.next();
        orderList.add(new Order(id,LocalDate.now()));
        System.out.println("Enter");
    }
}
