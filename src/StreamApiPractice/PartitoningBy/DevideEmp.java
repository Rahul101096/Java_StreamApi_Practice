
//2. Divide employees into:
//salary > 100000
//salary <= 100000
package StreamApiPractice.PartitoningBy;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DevideEmp {
    static void main() {
        List<Employees> list = Arrays.asList(
                new Employees("Rahul", 50000, "IT", 32, "Male"),
                new Employees("Priya", 75000, "IT", 28, "Female"),
                new Employees("Amit", 100000, "IT", 30, "Male"),
                new Employees("Sneha", 100000, "HR", 27, "Female"),
                new Employees("Vikram", 55000, "HR", 35, "Male"),
                new Employees("Pooja", 100000, "HR", 29, "Female"),
                new Employees("Arjun", 70000, "Finance", 31, "Male"),
                new Employees("Neha", 120000, "Finance", 26, "Female"),
                new Employees("Karan", 45000, "Finance", 33, "Male"),
                new Employees("Anjali", 130000, "IT", 29, "Female")
        );

        Map<Boolean, List<Employees>> result = list.stream()
                .collect(Collectors.partitioningBy(
                        emp -> emp.getSalary() > 100000
                ));

        result.forEach((salary, employees) ->
                System.out.println(salary + " = " + employees)
        );
    }
}
