//9. Convert a list of objects into a Map.
package StreamApiPractice.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListInToMap {
    static void main() {
        List<Employee> list= List.of(
                new Employee("Rahul", 49000, "IT"),
                new Employee("Amit", 200000, "IT"),
                new Employee("John", 220000, "IT")
        );

        Map<String, Integer> mapOfObj=list.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(mapOfObj);
    }
}
