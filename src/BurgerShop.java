import java.util.ArrayList;
public class BurgerShop {
    private String name;
    private String address;
    private ArrayList<Burger> menu;
    private ArrayList<Employee> employees;
    private ArrayList<Order> orders;

    public BurgerShop(String name, String address) {
        this.name = name;
        this.address = address;
        this.menu = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addBurger(Burger burger) {
        menu.add(burger);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Burger> getMenu() {
        return menu;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}

