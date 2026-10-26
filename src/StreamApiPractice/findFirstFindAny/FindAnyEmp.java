//4. Find any employee from the IT department.
package StreamApiPractice.findFirstFindAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyEmp {

    static void main() {


        List<Employees> list = Arrays.asList(
                new Employees("Rahul", 2345678, "CE"),
                new Employees("Aman", 2345678, "ME"),
                new Employees("Ajeet", 2345678, "IT"),
                new Employees("Vimal", 2345678, "ME"),
                new Employees("Addi", 2345678, "IT"),
                new Employees("Vikas", 2345678, "IT")

        );

        Optional<Employees> anyEmpOfIt = list.stream().filter(emp-> emp.getDepartment().equals("IT")).findAny();
        System.out.println(anyEmpOfIt);
    }
}
