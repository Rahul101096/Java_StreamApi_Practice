//4. Implement pagination using skip() and limit().

package StreamApiPractice.limitAndSkip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pagination {

    static void main() {
        List<Integer> list = Arrays.asList(
                1, 2, 3, 4, 5,
                6, 7, 8, 9, 10,
                11, 12, 13, 14, 15,
                16, 17, 18, 19, 20
        );

        List<Integer> result=list.stream().skip(5).limit(5).toList();
        System.out.println(result);

    }
}
