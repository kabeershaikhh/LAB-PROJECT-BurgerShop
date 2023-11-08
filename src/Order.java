import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Burger> burgers;
    private double totalPrice;

    public Order(Customer customer) {
        this.customer = customer;
        this.burgers = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addBurger(Burger burger) {
        burgers.add(burger);
        totalPrice += burger.getPrice();
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Burger> getBurgers() {
        return burgers;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

