//4. Find unique employee departments.
package StreamApiPractice.Distinct;

import java.util.Arrays;
import java.util.List;

public class UniqueEmpDep {

    public static void main(String[] args) {

        List<Employee> listOfEmp = Arrays.asList(
                new Employee(1, "Rahul", "IT"),
                new Employee(2, "Ajeet", "Gov"),
                new Employee(3, "Addi", "IT"),
                new Employee(4, "Gymmy", "Gov"),
                new Employee(5, "Saurabh", "EE")
        );

        List<String> uniqueEmp = listOfEmp.stream()
                .map(Employee::getDepartment)
                .distinct()
                .toList();

        System.out.println(uniqueEmp);
    }
}