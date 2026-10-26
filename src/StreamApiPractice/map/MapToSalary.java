package StreamApiPractice.map;

import java.util.List;

public class MapToSalary {
    static void main() {
        List<Employee> list= List.of(
                new Employee("Rahul", 49000, "IT"),
                new Employee("Amit", 200000, "IT"),
                new Employee("John", 220000, "IT")
        );

        List<Integer> emp=list.stream().map(sal->sal.getSalary()).toList();
        System.out.println(emp);
    }
}
