//10. Extract multiple fields from an object.
package StreamApiPractice.map;

import java.util.Arrays;
import java.util.List;

// A compact record to hold just the extracted fields
record EmpSummary(String name, String department) {}

public class ExtractMultipleFields {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("Rahul", 49000, "IT"),
                new Employee("Amit", 200000, "HR"),
                new Employee("John", 220000, "Finance")
        );

        // SOLUTION: Mapping each Employee to an EmpSummary record
        List<EmpSummary> summaryList = empList.stream()
                .map(emp -> new EmpSummary(emp.getName(), emp.getDepartment()))
                .toList();

        // O/P >> [EmpSummary[name=Rahul, department=IT], EmpSummary[name=Amit, department=HR], ...]
        System.out.println(summaryList);
    }
}
