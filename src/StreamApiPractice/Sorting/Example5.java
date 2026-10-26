//10. Sort strings based on length and then alphabetically.
//Example:
//employees.stream()
//    .sorted(Comparator.comparing(Employee::getSalary).reversed())
//    .toList();

package StreamApiPractice.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example5 {
    static void main() {
        List<String> listOfStrings= Arrays.asList("Rahul", "Ajay", "Avinash", "Vikas", "Jhon", "Anuradha");

        List<String> sortedList=listOfStrings.stream().sorted(Comparator.comparing(String::length).thenComparing(String::compareTo)).toList();
        System.out.println(sortedList);

    }
}
