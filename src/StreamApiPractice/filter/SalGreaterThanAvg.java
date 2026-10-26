//Find employees whose salary is greater than the average salary.
package StreamApiPractice.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalGreaterThanAvg {
    static void main() {
        List<Employee> listOfEmp= Arrays.asList(new Employee("Rahul", 49000), new Employee("Addi", 200000),
                new Employee("Gymmy", 220000), new Employee("Ajeet", 35000));
        /*double averageSalary = listOfEmp.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0.0); // Returns 0.0 if the list is empty

        System.out.println("Average Salary: " + averageSalary);
        System.out.println("-----------------------------------");

        // Step 2: Filter employees whose salary is greater than the average
        List<Employee> highEarners = listOfEmp.stream()
                .filter(emp -> emp.getSalary() > averageSalary)
                .collect(Collectors.toList());*/
        List<Employee> highEarners = listOfEmp.stream()
                .filter(emp -> emp.getSalary() > listOfEmp.stream().mapToInt(Employee::getSalary).average().orElse(0))
                .collect(Collectors.toList());


        // Print results
        highEarners.forEach(System.out::println);

    }
}
