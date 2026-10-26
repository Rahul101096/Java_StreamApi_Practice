//9. Sort employees by department and then salary.
package StreamApiPractice.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example4 {

    static void main() {
        List<Emply> list= Arrays.asList(
                new Emply("Rahul", 50000, "IT", 32),
                new Emply("Addi", 200000, "IT", 30),
                new Emply("Ajeet", 35000, "Gov", 29),
                new Emply("Gymmy", 200000, "IT", 31),
                new Emply("Manish", 50000, "Gov", 29),
                new Emply("Vimal", 52000, "EE", 30)

        );


        List<Emply> result=list.stream().sorted(Comparator.comparing(Emply::getDepartment).thenComparing(Emply::getSalary)).toList();
        System.out.println(result);
    }
}
