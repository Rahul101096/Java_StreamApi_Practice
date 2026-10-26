//14. Find total salary of each department.
package StreamApiPractice.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalSalInEachDep {

    static void main() {

        List<Emply> list= Arrays.asList(
                new Emply("Rahul", 50000, "IT", 32),
                new Emply("Addi", 200000, "IT", 30),
                new Emply("Ajeet", 35000, "Gov", 29),
                new Emply("Gymmy", 200000, "IT", 31),
                new Emply("Manish", 50000, "Gov", 29),
                new Emply("Aman", 200000, "ME", 31),
                new Emply("Vimal", 50000, "ME", 29)

        );

        Map<String, Integer> result=list.stream().collect(Collectors.groupingBy(Emply::getDepartment, Collectors.summingInt(Emply::getSalary)));
        System.out.println(result);
    }
}
