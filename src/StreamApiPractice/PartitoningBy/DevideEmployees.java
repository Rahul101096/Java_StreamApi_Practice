package StreamApiPractice.PartitoningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DevideEmployees {
    static void main() {
        List<EmployeeDetails> employees = Arrays.asList(
                new EmployeeDetails(101, "Rahul", "IT", 6, 80000),
                new EmployeeDetails(102, "Amit", "HR", 1, 35000),
                new EmployeeDetails(103, "Priya", "IT", 3, 60000),
                new EmployeeDetails(104, "Sneha", "Finance", 0, 30000),
                new EmployeeDetails(105, "Vikram", "IT", 5, 75000),
                new EmployeeDetails(106, "Pooja", "HR", 2, 45000)
        );

        Map<Boolean, List<String>> result = employees.stream()
                .collect(Collectors.partitioningBy(
                        emp -> emp.getExperience() >= 2,
                        Collectors.mapping(
                                EmployeeDetails::getName,
                                Collectors.toList()
                        )
                ));

        System.out.println("Experienced: " + result.get(true));
        System.out.println("Freshers: " + result.get(false));    }
}
