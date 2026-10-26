//1. Find top 3 numbers.

package StreamApiPractice.limitAndSkip;

import java.util.Arrays;
import java.util.List;

public class FindTop3Num {

    static void main() {
        List<Integer> list= Arrays.asList(23,45,64,13,42,78,69,55);
        List<Integer> result=list.stream().limit(3).toList();
        System.out.println(result);
    }
}
