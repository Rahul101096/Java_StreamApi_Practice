//3. Given employees with multiple skills, find all unique skills.
//Example:
//Rahul -> Java, Spring
//Amit  -> Java, Docker
//John  -> AWS, Java
//
//Output:
//Java
//Spring
//Docker
//AWS

package StreamApiPractice.flatMap;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example3 {
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

        // Step 1: Count how many employees have each skill
        Map<String, Long> skillCount = employees.stream()
                .flatMap(employee -> employee.getSkills().stream())
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        List<String> allSkills = employees.stream()
                .flatMap(employee -> employee.getSkills().stream())
                .toList();

        employees.stream()
                .flatMap(employee -> employee.getSkills().stream()
                        .filter(skill -> allSkills.stream()
                                .filter(s -> s.equals(skill))
                                .count() == 1)
                        .map(skill -> employee.getName() + " -> " + skill))
                .forEach(System.out::println);
    }

        /*employees.stream()
                .flatMap(e -> e.getSkills().stream()
                        .filter(skill -> employees.stream()
                                .flatMap(emp -> emp.getSkills().stream())
                                .filter(s -> s.equals(skill))
                                .count() == 1)
                        .map(skill -> e.getName() + " -> " + skill))
                .forEach(System.out::println);*/

}
