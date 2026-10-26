//Find Employee whose salary is greater than 50,000.
package StreamApiPractice.filter;


import java.util.Arrays;
import java.util.List;

class Employee {
    private String name;
    private int salary;
    private String department;
    private int age;

    public Employee(String name, int age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.department=department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
public class SalGreaterThan {
    static void main() {


        List<Employee> listOfEmp= Arrays.asList(new Employee("Rahul", 49000), new Employee("Addi", 200000),
                new Employee("Gymmy", 220000), new Employee("Ajeet", 35000));

        List<Employee> empList=listOfEmp.stream().filter(i->i.getSalary()>50000).toList();
        System.out.println(empList);

    }
}
