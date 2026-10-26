
//8. Convert employee names into their lengths.
package StreamApiPractice.map;

import java.util.List;

public class ConvertNameInToLen {

    static void main() {
        List<Employee> list= List.of(
                new Employee("Rahul", 49000, "IT"),
                new Employee("Amit", 200000, "IT"),
                new Employee("John", 220000, "IT")
        );

        List<Integer> lenOfName=list.stream().map(len-> len.getName().length()).toList();
        System.out.println(lenOfName);
    }
}
