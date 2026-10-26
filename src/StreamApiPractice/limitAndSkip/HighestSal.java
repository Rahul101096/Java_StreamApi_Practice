//2. Find top 5 highest salaries.

package StreamApiPractice.limitAndSkip;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestSal {

    static void main() {
        List<Integer> list= Arrays.asList(23,45,64,13,42,78,69,55);
        List<Integer> result=list.stream().sorted(Comparator.reverseOrder()).limit(5).toList();
        System.out.println(result);
    }
}
