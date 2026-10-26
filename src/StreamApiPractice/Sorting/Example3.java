//8. If salary is same, sort by name.

package StreamApiPractice.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example3 {
    static void main() {


        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", 50000, 32),
                new Employee(2, "Amit", 75000, 32),
                new Employee(3, "John", 50000, 32),
                new Employee(4, "Priya", 90000, 32),
                new Employee(5, "Aman", 90000, 33)
        );

        List<Employee> result = employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).toList();
        System.out.println(result);
    }
}
