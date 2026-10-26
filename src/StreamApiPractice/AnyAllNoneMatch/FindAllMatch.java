//7. Check whether all employees belong to IT.
package StreamApiPractice.AnyAllNoneMatch;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAllMatch {
    static void main() {
        List<Emply> list=Arrays.asList(
                new Emply("Rahul", 50000, "IT", 32),
                new Emply("Addi", 200000, "IT", 30),
                new Emply("Ajeet", 35000, "Gov", 29),
                new Emply("Gymmy", 200000, "IT", 31),
                new Emply("Manish", 50000, "Gov", 29)

        );

        boolean result=list.stream().allMatch(dep->dep.getDepartment().equals("IT"));
        System.out.println(result);
    }
}
