//11. Find the highest-paid employee in each department.

package StreamApiPractice.GroupingBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestSalInEachDep {
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

        Map<String, java.util.Optional<Emply>> result =
                list.stream().collect(Collectors.groupingBy(
                        Emply::getDepartment,
                        Collectors.maxBy(
                                Comparator.comparingDouble(Emply::getSalary)
                        )
                ));

        result.forEach((department, employee) ->
                System.out.println(department + " = " + employee.orElse(null))
        );

        System.out.println(result);
    }
}
