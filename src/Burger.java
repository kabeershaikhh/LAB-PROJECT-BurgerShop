import java.util.ArrayList;
public class Burger {
    private String name;
    private String description;
    private double price;
    private ArrayList<Ingredient> ingredients;

    public Burger(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}

