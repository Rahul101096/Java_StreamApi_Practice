//5. Divide numbers into positive/negative.

package StreamApiPractice.PartitoningBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DevidePosNeg {

    static void main() {

        List<Integer>  num= List.of(2,5,3,8,-3,-6,1,-9,8,-10);

        Map<Boolean, List<Integer>> result=num.stream().collect(Collectors.partitioningBy(i-> i>0));
        System.out.println(result);

    }
}
