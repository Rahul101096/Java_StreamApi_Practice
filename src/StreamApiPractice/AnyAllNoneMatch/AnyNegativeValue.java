//9. Check whether any number is negative.

package StreamApiPractice.AnyAllNoneMatch;

import java.util.Arrays;
import java.util.List;

public class AnyNegativeValue {

    static void main() {
        List<Integer> list= Arrays.asList(10,12,-15, 34,-28,67,-90);

        boolean checkNegative=list.stream().anyMatch(num -> num <0);
        System.out.println(checkNegative);
    }
}
