package StreamApiPractice.Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueSalary {

    public static void main(String[] args) {

        List<Employees> employees = Arrays.asList(
                new Employees(1, "Rahul", 50000),
                new Employees(2, "Amit", 60000),
                new Employees(3, "Priya", 50000),
                new Employees(4, "John", 70000),
                new Employees(5, "Saurabh", 60000)
        );

        List<Integer> uniqueSalaries = employees.stream()
                .map(Employees::getSalary)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .toList();

        /*List<Integer> uniqueSalaries = Employees.stream()
                .map(Employee::getSalary)
                .filter(salary -> employees.stream()
                        .map(Employee::getSalary)
                        .filter(s -> s.equals(salary))
                        .count() == 1)
                .distinct()
                .toList();*/

        System.out.println(uniqueSalaries);
    }
}