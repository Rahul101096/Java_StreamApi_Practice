//5. Find the first name starting with "R".
package StreamApiPractice.findFirstFindAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNameStartsWith {

    static void main() {

        List<Employees> list = Arrays.asList(
                new Employees("Rahul", 2345678, "CE"),
                new Employees("Vijay", 2345678, "ME"),
                new Employees("Ajeet", 2345678, "IT"),
                new Employees("Vimal", 2345678, "ME"),
                new Employees("Addi", 2345678, "IT"),
                new Employees("Vikas", 2345678, "IT")

        );

        Optional<Employees> result=list.stream().filter(emp-> emp.getName().startsWith("A")).findFirst();
        System.out.println(result);
    }
}
