
//6. Convert List<Employee> → List<String> containing employee names.
package StreamApiPractice.map;

import java.sql.SQLOutput;
import java.util.List;

public class MapEmpToName {

    static void main() {
        List<Employee> list= List.of(
                new Employee("Rahul", 49000, "IT"),
                new Employee("Amit", 200000, "IT"),
                new Employee("John", 220000, "IT")
        );

        List<String> name=list.stream().map(emp->emp.getName()).toList();
        System.out.println(name);
    }
}
