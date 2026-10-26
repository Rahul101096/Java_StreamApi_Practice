package StreamApiPractice.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", 50000, 32),
                new Employee(2, "Amit", 75000, 32),
                new Employee(3, "John", 40000, 32),
                new Employee(4, "Priya", 90000, 32)
        );

        List<Employee> result = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();

        result.forEach(System.out::println);
    }
}