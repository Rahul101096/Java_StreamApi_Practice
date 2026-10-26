package StreamApiPractice.map;

//import StreamApiPractice.fi.Employee;

import java.util.Arrays;
import java.util.List;


public class MapEmpToNames {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("Rahul", 49000, "IT"),
                new Employee("Amit", 200000, "IT"),
                new Employee("John", 220000, "IT")
        );

        // SOLUTION: Transform Employee objects into a list of Name Strings
        List<String> names = empList.stream()
                .map(Employee::getName) // Extracts the name property from each Employee
                .toList();              // Use .collect(Collectors.toList()) if using Java 8-15

        // O/P >> [Rahul, Amit, John]
        System.out.println(names);
    }
}
