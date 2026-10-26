//1. Group employees by department.
package StreamApiPractice.GroupingBy;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmpByDep {
    static void main() {
        List<Emply> list= Arrays.asList(
                new Emply("Rahul", 50000, "IT", 32),
                new Emply("Addi", 200000, "IT", 30),
                new Emply("Ajeet", 35000, "Gov", 29),
                new Emply("Gymmy", 200000, "IT", 31),
                new Emply("Manish", 50000, "Gov", 29)

        );

        Map<String, List<Emply>> result=list.stream().collect(Collectors.groupingBy(Emply::getDepartment));

        System.out.println(result);
    }
}
