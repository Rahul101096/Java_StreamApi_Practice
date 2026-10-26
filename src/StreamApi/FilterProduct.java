//filter the product based on the categories

package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

class Product {
    private String name;
    private double price;
    private String categories;

    public Product(String name, double price, String categories) {
        this.name = name;
        this.price = price;
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categories='" + categories + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategories() {
        return categories;
    }

}

public class FilterProduct {

    static void main() {

        List<Product> product= Arrays.asList(new Product("TV", 9999, "Electronics"),
                new Product("Mobile", 15000, "Electronics"), new Product("Car", 70000, "fourWheeler"),
                new Product("Bike", 20000, "twoWheeler"), new Product("shop", 100000, "business"));
        Stream<Product> stream=product.stream();
        List<Product> filter=stream.filter(products -> products.getCategories().equals("Electronics")).filter(product1 -> product1.getPrice()>10000).toList();
        filter.forEach(products -> System.out.println(products.toString()));



    }
}
