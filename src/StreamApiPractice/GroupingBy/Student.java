
package StreamApiPractice.GroupingBy;

public class Student {

    private int studentId;
    private String name;
    private String grade;
    private double marks;

    public Student(int studentId, String name, String grade, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', grade='" + grade + "'}";
    }
}
