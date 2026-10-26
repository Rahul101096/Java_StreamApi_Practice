package StreamApiPractice.PartitoningBy;

public class EmployeeDetails {

    private int id;
    private String name;
    private String department;
    private int experience;
    private double salary;

    public EmployeeDetails(int id, String name, String department,
                           int experience, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.experience = experience;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + experience + " years)";
    }
}
