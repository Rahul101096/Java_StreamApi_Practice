//3. Find the first even number.
package StreamApiPractice.findFirstFindAny;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEven {
    static void main() {
        List<Integer> list = Arrays.asList(23, 45, 64, 13, 42, 78, 69, 55);

        Optional<Integer> firstEvenNum=list.stream().filter(num-> num%2==0).findAny();
        System.out.println(firstEvenNum);
    }
}
