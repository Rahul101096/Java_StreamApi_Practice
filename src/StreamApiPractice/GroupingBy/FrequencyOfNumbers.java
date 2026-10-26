//6. Find frequency of each number.

package StreamApiPractice.GroupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfNumbers {

    static void main() {
        List<Integer> list= Arrays.asList(1,1,1,2,2,3,1,4,4,2);

        Map<Integer, Long> frequency =list.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        System.out.println(frequency);
    }
}
