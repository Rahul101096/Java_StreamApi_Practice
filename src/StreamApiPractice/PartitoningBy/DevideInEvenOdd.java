//Divide numbers into even and odd.

package StreamApiPractice.PartitoningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DevideInEvenOdd {
    static void main() {
        List<Integer> list= Arrays.asList(23,4,5,67,32,43,11,68,45,22);

        Map<Boolean, List<Integer>> result=list.stream().collect(Collectors.partitioningBy(num-> num%2==0));
        System.out.println(result);
    }
}
