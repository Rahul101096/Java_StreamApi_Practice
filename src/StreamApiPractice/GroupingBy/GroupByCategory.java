//3. Group products by category.

package StreamApiPractice.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByCategory {
    static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product(101, "iPhone", "Electronics", 80000),
                new Product(102, "Samsung TV", "Electronics", 45000),
                new Product(103, "Nike Shoes", "Fashion", 5000),
                new Product(104, "T-Shirt", "Fashion", 1200),
                new Product(105, "Java Book", "Books", 800),
                new Product(106, "Laptop", "Electronics", 65000)
        );

        Map<String, Long> result=productList.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));

        System.out.println(result);


    }
}
