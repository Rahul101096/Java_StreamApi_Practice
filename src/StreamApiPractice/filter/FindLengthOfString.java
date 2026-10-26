//Find strings whose length is greater than 5.
package StreamApiPractice.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindLengthOfString {
    static void main() {
        List<String> listOfString= Arrays.asList("Rahul", "Addi", "Aman", "Gymmy", "Vimal", "Ajeet", "Manjeet");
        List<String> result=listOfString.stream().filter(str->str.length() > 5).toList();
        System.out.println(result);
    }
}
