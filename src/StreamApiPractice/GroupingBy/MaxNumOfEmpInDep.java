//10. Find the department having the maximum number of employees.

package StreamApiPractice.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxNumOfEmpInDep {

    static void main() {

        List<Emply> list= Arrays.asList(
                new Emply("Rahul", 50000, "IT", 32),
                new Emply("Addi", 200000, "IT", 30),
                new Emply("Ajeet", 35000, "Gov", 29),
                new Emply("Gymmy", 200000, "IT", 31),
                new Emply("Manish", 50000, "Gov", 29)

        );

        Map<String, Long> maxNumOfEmp=list.stream().collect(Collectors.groupingBy(Emply::getDepartment, Collectors.counting()));
        maxNumOfEmp.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);
    }
}
