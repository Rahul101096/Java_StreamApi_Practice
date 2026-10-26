//4. Group students by grade.

package StreamApiPractice.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGrade {
    static void main() {

        List<Student> studentList = Arrays.asList(
                new Student(101, "Rahul", "A", 92),
                new Student(102, "Amit", "B", 78),
                new Student(103, "Priya", "A", 95),
                new Student(104, "John", "C", 65),
                new Student(105, "Sneha", "B", 82),
                new Student(106, "Vikram", "A", 89)
        );



        Map<String, List<Student>> result=studentList.stream().collect(Collectors.groupingBy(Student::getGrade));
        System.out.println(result);

        Map<String, List<String>> result2 = studentList.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(
                                Student::getName,
                                Collectors.toList()
                        )
                ));

        System.out.println(result2);
    }
}
