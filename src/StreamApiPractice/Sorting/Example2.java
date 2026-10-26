//7. Sort employees by salary descending.
package StreamApiPractice.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Example2 {

    static void main() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", 50000, 32),
                new Employee(2, "Amit", 75000, 32),
                new Employee(3, "John", 40000, 32),
                new Employee(4, "Priya", 90000, 32)
        );

       // List<Employee> result=employees.stream().sorted(Comparator.comparing(emp->emp.getSalary()).reversed()).toList();
        List<Employee> result = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println(result);
    }
}
