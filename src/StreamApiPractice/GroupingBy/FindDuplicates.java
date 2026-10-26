//8. Find duplicate elements.

package StreamApiPractice.GroupingBy;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {

    static void main() {
        String str="Appropriate";

        Map<Character, Long> duplicates = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        ch -> ch,
                        Collectors.counting()
                ));

        System.out.println(duplicates);

        duplicates.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(System.out::println);
        /*Set<Character> seen = new HashSet<>();

str.chars()
    .mapToObj(ch -> (char) ch)
    .filter(ch -> !seen.add(ch))
    .distinct()
    .forEach(System.out::println);*/
    }
}
