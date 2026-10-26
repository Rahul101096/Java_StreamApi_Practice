//Find Emplyloyees whose age is between 25 and 35.
package StreamApiPractice.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAgeBetween {

    static void main() {


        List<Emply> EmplyList = Arrays.asList(new Emply("Rahul", 49000, "IT", 34),
                new Emply("Addi", 200000, "IT", 28),
                new Emply("Gymmy", 220000, "IT", 24),
                new Emply("Ajeet", 35000, "Gov", 29),
                new Emply("Shivam", 120000, "Gov", 30),
                new Emply("Vim", 55000, "ME", 25)
        );

        List<Emply> result = EmplyList.stream().filter(age -> age.getAge() >= 25 && age.getAge() <= 35).toList();
        System.out.println(result);
    }
}