import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}

public class PatikaStoreApp {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 2500.0);
        Product phone = new Product("Phone", 1000.0);
        Product headphones = new Product("Headphones", 150.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(phone);
        cart.addProduct(headphones);

        double totalPrice = cart.getTotalPrice();

        System.out.println("Shopping Cart Total Price: " + totalPrice);
    }
}
