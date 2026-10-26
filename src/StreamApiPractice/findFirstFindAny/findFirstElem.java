//1. Find the first element.

package StreamApiPractice.findFirstFindAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirstElem {
    static void main() {
        List<Integer> list = Arrays.asList(23, 45, 64, 13, 42, 78, 69, 55);

        Optional<Integer> firstNum = list.stream().findFirst();
        System.out.println(firstNum);
    }
}
