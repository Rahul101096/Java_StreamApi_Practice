package StreamApiPractice.filter;

import java.util.Arrays;
import java.util.List;

public class FilterEmployees {
    static void main() {
        List<Emp> listOfEmployee= Arrays.asList(
                new Emp("Rahul", 49000, "IT", 33),
                new Emp("Addi", 200000, "IT", 30),
                new Emp("Gymmy", 220000, "IT", 33),
                new Emp("Ajeet", 35000, "Gov", 33),
                new Emp("Shivam", 120000, "Gov", 33),
                new Emp("Vim", 55000, "ME", 33)
        );

        List<Emp> result=listOfEmployee.stream().filter(sal->sal.getName().startsWith("A") && sal.getSalary()>100000).toList();
        System.out.println(result);

    }
}
