//3. Divide students into pass/fail.
package StreamApiPractice.PartitoningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentPassFail {
    static void main() {

        List<Student> students = Arrays.asList(
                new Student("Rahul", 85),
                new Student("Priya", 32),
                new Student("Amit", 65),
                new Student("Sneha", 25),
                new Student("Vikram", 40),
                new Student("Pooja", 90),
                new Student("Arjun", 28),
                new Student("Neha", 76),
                new Student("Karan", 35),
                new Student("Anjali", 55)
        );

        Map<Boolean, List<Student>> result = students.stream()
                .collect(Collectors.partitioningBy(
                        student -> student.getMarks() >= 35
                ));

        result.forEach((passed, studentList) -> {
            if (passed) {
                System.out.println("Pass students: " + studentList);
            } else {
                System.out.println("Failed students: " + studentList);
            }
        });
    }
}
