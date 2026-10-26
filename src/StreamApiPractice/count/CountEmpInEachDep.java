//7. Count employees in each department.

package StreamApiPractice.count;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmpInEachDep {

    static void main() {
        List<Emply> EmplyList = Arrays.asList(
                new Emply("Rahul", 49000, "IT", 34),
                new Emply("Addi", 200000, "IT", 28),
                new Emply("Gymmy", 220000, "IT", 24),
                new Emply("Ajeet", 35000, "Gov", 29),
                new Emply("Shivam", 120000, "Gov", 30),
                new Emply("Vim", 55000, "ME", 25)
        );

        Map<String, Long> empCount = EmplyList.stream()
                .collect(Collectors.groupingBy(
                        Emply::getDepartment,
                        Collectors.counting()
                ));

        System.out.println(empCount);
    }
}
