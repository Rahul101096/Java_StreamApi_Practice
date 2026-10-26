//2. Find the first employee whose salary > 50,000.

package StreamApiPractice.findFirstFindAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    static void main() {
        List<Employee> employeeList= Arrays.asList(
                new Employee(1, "Aman", 50000),
                new Employee(2, "Rahul", 51000),
                new Employee(3, "Ajay", 78000),
                new Employee(4, "vikas", 120000),
                new Employee(5, "Vimal", 140000),
                new Employee(6, "Ajeet", 35000)
        );

        Optional<Employee> findFirstEmp=employeeList.stream().filter(emp->emp.getSalary()> 50000).findFirst();
        System.out.println(findFirstEmp);
    }
}
