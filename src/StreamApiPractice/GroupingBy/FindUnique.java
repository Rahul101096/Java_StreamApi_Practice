package StreamApiPractice.GroupingBy;

import java.util.Map;
import java.util.stream.Collectors;

public class FindUnique {
    static void main() {

            String str = "Appropriate";

           /* Map<Character, Long> frequency = str.chars()
                    .mapToObj(ch -> (char) ch)
                    .collect(Collectors.groupingBy(
                            ch -> ch,
                            Collectors.counting()
                    ));

            frequency.entrySet().stream()
                    .filter(entry -> entry.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .forEach(System.out::println);
*/

        str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey).forEach(System.out::println);
    }
}
