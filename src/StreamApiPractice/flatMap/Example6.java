
//6. Flatten nested objects.
package StreamApiPractice.flatMap;

//package StreamApiPractice.flatMap;

import java.util.List;

public class Example6 {

    public static void main(String[] args) {

        // Creating list of employees
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

        // Flatten all employee skills
        List<String> skills = employees.stream()
                .flatMap(employee -> employee.getSkills().stream()).distinct()
                .toList();

        // Print result
        System.out.println("All Skills:");
        System.out.println(skills);
    }
}
