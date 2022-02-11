import enums.Location;
import products.Crisp;
import products.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Drawer {

    private Location location;
    private int quantity;
    private ArrayList<Product> products;

    public Drawer(Location location, int quantity) {
        this.location = location;
        this.quantity = 0;
        this.products = new ArrayList<>();
    }

    public Location getLocation() {
        return location;
    }

    public int getQuantity() {
        return quantity;
    }

    public ArrayList<Product> getProduct() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
