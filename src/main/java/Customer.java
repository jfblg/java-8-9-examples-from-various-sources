import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<Order> getOrders() {
        return this.orders;
    }

    public Customer addOrder(Order order) {
        orders.add(order);
        return this;
    }
}
