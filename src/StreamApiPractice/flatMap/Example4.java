//4. Find the count of unique skills across all employees.

package StreamApiPractice.flatMap;

import java.util.List;

public class Example4 {

    public static void main(String[] args) {

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

        long count = employees.stream()
                .flatMap(e -> e.getSkills().stream())
                .distinct()
                .count();

        System.out.println(count);
    }
}