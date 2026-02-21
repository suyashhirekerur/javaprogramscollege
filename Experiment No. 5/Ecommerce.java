import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " - $" + price;
    }
}

class Customer {
    private String name;
    private int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String toString() {
        return "Customer: " + name + " (ID: " + customerId + ")";
    }
}

class Order {
    private Customer customer;
    private ArrayList<Product> products = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println(customer);
        System.out.println("Products:");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("Total Cost: $" + calculateTotal());
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Mouse", 20);
        Product p3 = new Product("Keyboard", 40);

        Customer c1 = new Customer("Suyash", 1);

        Order order = new Order(c1);
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        order.displayOrder();
    }
}