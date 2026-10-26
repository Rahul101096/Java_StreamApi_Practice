package StreamApiPractice.GroupingBy;

public class Employees {

    private String name;
    private int salary;
    private String department;
    private int age;
    private String gender;

    public Employees(String name, int salary, String department, int age, String gender) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Emply{name='" + name + "', salary=" + salary
                + ", department='" + department + "', age=" + age
                + ", gender='" + gender + "'}";
    }
}