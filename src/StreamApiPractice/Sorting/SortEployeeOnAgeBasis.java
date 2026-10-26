//6. Sort employees by age.
package StreamApiPractice.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEployeeOnAgeBasis {

    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", 50000, 32),
                new Employee(2, "Amit", 75000, 29),
                new Employee(3, "John", 40000, 30),
                new Employee(4, "Priya", 90000, 28)
        );

        List<Employee> result=employees.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
        System.out.println(result);
    }
}
