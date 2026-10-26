//Find the third highest salary.
package StreamApiPractice.limitAndSkip;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdHighestSal {
    static void main() {

        List<Employee> employeeList= Arrays.asList(
                new Employee(1, "Aman", 50000),
                new Employee(2, "Rahul", 51000),
                new Employee(3, "Ajay", 78000),
                new Employee(4, "vikas", 120000),
                new Employee(5, "Vimal", 140000),
                new Employee(6, "Ajeet", 35000)
        );

        Optional<Employee> result=employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
        System.out.println(result);
    }
}
