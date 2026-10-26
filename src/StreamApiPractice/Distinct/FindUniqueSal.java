//6. Find unique salaries.
package StreamApiPractice.Distinct;


import java.util.Arrays;
import java.util.List;

public class FindUniqueSal {

    static void main() {

        List<Emply> list=Arrays.asList(
                new Emply("Rahul", 50000, "IT", 32),
                new Emply("Addi", 200000, "IT", 30),
                new Emply("Ajeet", 35000, "Gov", 29),
                new Emply("Gymmy", 200000, "IT", 31),
                new Emply("Manish", 50000, "Gov", 29)

        );

        List<Integer> sal=list.stream().map(Emply::getSalary).distinct().toList();
        System.out.println(sal);



    }
}
