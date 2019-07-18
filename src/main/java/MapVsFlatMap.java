import java.util.Arrays;
import java.util.List;

public class MapVsFlatMap {
    public static void main(String[] args) {
        Customer fero = new Customer("fero");
        Customer olo = new Customer("olo");
        Customer john = new Customer("john");

        fero.addOrder(new Order(1)).addOrder(new Order(2)).addOrder(new Order(3));
        olo.addOrder(new Order(4)).addOrder(new Order(5));

        List<Customer> customers = Arrays.asList(fero, olo, john);

        customers.stream()
                .map(Customer::getName)
                .forEach(System.out::println);

        customers.stream()
                .map(Customer::getOrders)
                .forEach(System.out::println);

        customers.stream()
                .map(customer -> customer.getOrders().stream())
                .forEach(System.out::println);

        customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .forEach(System.out::println);
    }
}
