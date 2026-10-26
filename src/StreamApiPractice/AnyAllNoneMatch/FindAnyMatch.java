//6. Check whether any employee earns more than ₹1 lakh
package StreamApiPractice.AnyAllNoneMatch;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyMatch {
    static void main() {
        List<Employees> employees = Arrays.asList(
                new Employees(1, "Rahul", 50000),
                new Employees(2, "Amit", 60000),
                new Employees(3, "Priya", 120000),
                new Employees(4, "John", 100000),
                new Employees(5, "Saurabh", 60000)
        );

        Optional<Employees> result=employees.stream().filter(emp-> emp.getSalary()>100000).findAny();
        System.out.println(result);
    }
}
