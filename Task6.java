import java.util.*;
import java.util.stream.*;

public class Task6 {

    
    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 75000.00));
        products.add(new Product("Mouse", 450.00));
        products.add(new Product("Keyboard", 1200.00));
        products.add(new Product("Monitor", 5500.00));
        products.add(new Product("USB Drive", 350.00));
        products.add(new Product("Headphones", 1800.00));

        
        System.out.print("Enter price limit to filter products: ");
        double priceLimit = input.nextDouble();

        
        long count = products.stream()
                .filter(p -> p.price > priceLimit)
                .count();

        System.out.println("Number of products priced above " + priceLimit + ": " + count);

        input.close();
    }
}
