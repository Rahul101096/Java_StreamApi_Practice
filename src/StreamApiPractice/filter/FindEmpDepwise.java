package StreamApiPractice.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Emp{
    public Emp(String name, int salary, String department, int i) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age=age;
    }

    private String name;
    private int salary;
    private int age;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;
}

public class FindEmpDepwise {
    // Note: Standard execution requires 'public static void main(String[] args)'
    public static void main(String[] args) {
        List<Emp> listOfEmp = Arrays.asList(
                new Emp("Rahul", 49000, "IT", 33),
                new Emp("Addi", 200000, "IT", 33),
                new Emp("Gymmy", 220000, "IT", 33),
                new Emp("Ajeet", 35000, "Gov", 33),
                new Emp("Shivam", 120000, "Gov", 33),
                new Emp("Vim", 55000, "ME", 33)
        );

        // This will now successfully match "IT" because the department field is properly populated
        List<Emp> empList = listOfEmp.stream()
                .filter(emp -> "IT".equalsIgnoreCase(emp.getDepartment()))
                .collect(Collectors.toList());

        System.out.println(empList);
    }
}
