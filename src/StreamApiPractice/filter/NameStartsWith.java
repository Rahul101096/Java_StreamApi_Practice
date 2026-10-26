//Find names starting with "A".
package StreamApiPractice.filter;

import java.util.Arrays;
import java.util.List;

public class NameStartsWith {
    static void main() {
        List<String> list= Arrays.asList("Rahul", "Addi", "Aman", "Gymmy", "Vimal", "Ajeet", "Manjeet");

        List<String> result=list.stream().filter(str-> str.startsWith("A")).toList();
        System.out.println(result);
    }
}
