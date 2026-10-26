//3. Skip first 3 elements.

package StreamApiPractice.limitAndSkip;

import java.util.Arrays;
import java.util.List;

public class SkipFirstThree {

    static void main() {


        List<Integer> list = Arrays.asList(23, 45, 64, 13, 42, 78, 69, 55);

        List<Integer> result = list.stream().skip(3).toList();

        System.out.println(result);
    }
}
