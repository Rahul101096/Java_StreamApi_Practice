//15. Find employees grouped by department and then by gender.

package StreamApiPractice.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example {

    static void main() {

        List<Employees> list = Arrays.asList(
                new Employees("Rahul", 50000, "IT", 32, "Male"),
                new Employees("Priya", 75000, "IT", 28, "Female"),
                new Employees("Amit", 60000, "IT", 30, "Male"),
                new Employees("Sneha", 80000, "HR", 27, "Female"),
                new Employees("Vikram", 55000, "HR", 35, "Male"),
                new Employees("Pooja", 65000, "HR", 29, "Female"),
                new Employees("Arjun", 70000, "Finance", 31, "Male"),
                new Employees("Neha", 90000, "Finance", 26, "Female"),
                new Employees("Karan", 45000, "Finance", 33, "Male"),
                new Employees("Anjali", 85000, "IT", 29, "Female")
        );

        Map<String, Map<String, List<Employees>>> result=list.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.groupingBy(Employees::getGender)));
       // System.out.println(result);

        result.forEach((department, genderMap) -> {
            System.out.println(department + " = " + genderMap);
        });

        Map<String, Map<String, List<String>>> result2 = list.stream()
                .collect(Collectors.groupingBy(
                        Employees::getDepartment,
                        Collectors.groupingBy(
                                Employees::getGender,
                                Collectors.mapping(
                                        Employees::getName,
                                        Collectors.toList()
                                )
                        )
                ));

        result2.forEach((department, genderMap) -> {
            System.out.println(department + " = " + genderMap);
        });
    }
}
