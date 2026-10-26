
//3. Count employees in IT.
//4. Count employees earning more than ₹1 lakh.

package StreamApiPractice.count;

import java.util.Arrays;
import java.util.List;

public class CountEmpInDep {

    static void main() {
        List<Emply> EmplyList = Arrays.asList(
                new Emply("Rahul", 49000, "IT", 34),
                new Emply("Addi", 200000, "IT", 28),
                new Emply("Gymmy", 220000, "IT", 24),
                new Emply("Ajeet", 35000, "Gov", 29),
                new Emply("Shivam", 120000, "Gov", 30),
                new Emply("Vim", 55000, "ME", 25)
        );

        long countITDepEmp=EmplyList.stream().filter(emp-> emp.getDepartment().equals("IT")).count();
        System.out.println(countITDepEmp);

        //Count Employee earning  more than 1L
        long countOneLakSalEmp=EmplyList.stream().filter(sal-> sal.getSalary()>100000).count();
        System.out.println("Count of Employee who's earning more than 1 L : "+countOneLakSalEmp);

    }
}
