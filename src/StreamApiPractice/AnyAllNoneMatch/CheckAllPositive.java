//10. Check whether all numbers are positive.

package StreamApiPractice.AnyAllNoneMatch;

import java.util.Arrays;
import java.util.List;

public class CheckAllPositive {
    static void main() {
        List<Integer> list= Arrays.asList(10,12,-15, 34,-28,67,-90);
        List<Integer> list1= Arrays.asList(10,12,15, 34,28,67,90);


        boolean checkAllPositive=list.stream().allMatch(num-> num>0);
        System.out.println(checkAllPositive);

        System.out.println("==============================================================");

        boolean checkAllPositive1=list1.stream().allMatch(num-> num>0);
        System.out.println(checkAllPositive1);
    }
}
