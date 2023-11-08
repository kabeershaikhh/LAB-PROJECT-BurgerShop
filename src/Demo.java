public class Demo {

    public static void main(String[] args) {
        // Create a burger shop instance
        BurgerShop burgerShop = new BurgerShop("Burger Lab", "AutoBahn Road Hyderabad");

        // Create some burgers and add them to the menu
        Burger cheeseBurger = new Burger("Cheeseburger", "A classic burger with cheese", 5.99);
        cheeseBurger.addIngredient(new Ingredient("Bun", 0.50));
        cheeseBurger.addIngredient(new Ingredient("Patty", 2.00));
        cheeseBurger.addIngredient(new Ingredient("Cheese", 0.75));
        cheeseBurger.addIngredient(new Ingredient("Lettuce", 0.25));
        cheeseBurger.addIngredient(new Ingredient("Tomato", 0.25));
        cheeseBurger.addIngredient(new Ingredient("Ketchup", 0.10));
        cheeseBurger.addIngredient(new Ingredient("Mustard", 0.10));

        Burger veggieBurger = new Burger("Veggie Burger", "A vegetarian burger ", 4.99);
        veggieBurger.addIngredient(new Ingredient("Bun", 0.50));
        veggieBurger.addIngredient(new Ingredient("Potato Patty", 1.50));
        veggieBurger.addIngredient(new Ingredient("Cheese", 0.75));
        veggieBurger.addIngredient(new Ingredient("Lettuce", 0.25));
        veggieBurger.addIngredient(new Ingredient("Tomato", 0.25));
        veggieBurger.addIngredient(new Ingredient("Mayo", 0.10));
        veggieBurger.addIngredient(new Ingredient("Relish", 0.10));

        Burger chickenBurger = new Burger("Chicken Burger", "A juicy burger with chicken", 6.99);
        chickenBurger.addIngredient(new Ingredient("Bun", 0.50));
        chickenBurger.addIngredient(new Ingredient("Grilled Chicken", 3.00));
        chickenBurger.addIngredient(new Ingredient("Cheese", 0.75));
        chickenBurger.addIngredient(new Ingredient("Lettuce", 0.25));
        chickenBurger.addIngredient(new Ingredient("Tomato", 0.25));
        chickenBurger.addIngredient(new Ingredient("Mayo", 0.10));
        chickenBurger.addIngredient(new Ingredient("BBQ Sauce", 0.10));

        burgerShop.addBurger(cheeseBurger);
        burgerShop.addBurger(veggieBurger);
        burgerShop.addBurger(chickenBurger);

        // Create some employees and add them to the burger shop
        Employee ahmed = new Employee("Ahmed", "0334-2376453", "ahmed123@gmail.com", "Cashier");
        Employee amanat = new Employee("Amanat", "0311-4578345", "amanat784@gmail.com", "Cook");
        Employee hammad = new Employee("Hammad", "0333-2349886", "hammadali@gmail.com", "Manager");

        burgerShop.addEmployee(ahmed);
        burgerShop.addEmployee(amanat);
        burgerShop.addEmployee(hammad);

        // Create some customers and orders
        Customer kabeer = new Customer("Kabeer", "0331-5674444", "kabeer@gmail.com");
        Customer taha = new Customer("Taha", "0345-5521555", "taha@yahoo.com");
        Customer sadat = new Customer("Sadat", "0366-6500266", "sadat@gmail.com");

        Order order1 = new Order(kabeer);
        order1.addBurger(cheeseBurger);
        order1.addBurger(veggieBurger);

        Order order2 = new Order(sadat);
        order2.addBurger(chickenBurger);

        Order order3 = new Order(taha);
        order3.addBurger(cheeseBurger);
        order3.addBurger(chickenBurger);

        burgerShop.addOrder(order1);
        burgerShop.addOrder(order2);
        burgerShop.addOrder(order3);

        System.out.println("Welcome to " + burgerShop.getName() + " at " + burgerShop.getAddress()+"\n");
        System.out.println("We have the following burgers on our menu:");
        for (Burger burger : burgerShop.getMenu()) {
            System.out.println(burger.getName() + " - " + burger.getDescription() + " - $" + burger.getPrice());
        }
        System.out.println("\nWe have the following employees working at our burger shop:\n");
        for (Employee employee : burgerShop.getEmployees()) {
            System.out.println(employee.getName() + " - " + employee.getPosition() + " - " + employee.getEmail());
        }
        System.out.println("\nWe have the following customers who have placed orders at our burger shop:\n");
        for (Order order : burgerShop.getOrders()) {
            System.out.println(order.getCustomer().getName() + " - " + order.getCustomer().getPhoneNumber() + " - " + order.getCustomer().getEmail());
            System.out.println("The order consists of the following burgers:");
            for (Burger burger : order.getBurgers()) {
                System.out.println(burger.getName() + " - $" + burger.getPrice());
            }
            System.out.println("The total price of the order is: $" + order.getTotalPrice()+"\n");
        }
    }
}
