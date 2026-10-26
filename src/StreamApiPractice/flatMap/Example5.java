
//5. Find employees having a particular skill.
package StreamApiPractice.flatMap;

import java.util.Arrays;
import java.util.List;

public class Example5 {
    static void main() {
        List<Employee> employees = List.of(

                new Employee(
                        1,
                        "Rahul",
                        List.of("Java", "AWS", "Microservices")
                ),

                new Employee(
                        2,
                        "Amit",
                        List.of("Java", "Azure", "Spring Boot")
                ),

                new Employee(
                        3,
                        "Priya",
                        List.of("Java", "AWS", "Azure", "Microservices")
                ),

                new Employee(
                        4,
                        "John",
                        List.of("Python", "AWS", "Docker")
                )
        );


        List<Employee> result = employees.stream()
                .filter(emp -> emp.getSkills().contains("Java"))
                .toList();

        result.forEach(emp -> System.out.println(emp.getName()));
    }
}
