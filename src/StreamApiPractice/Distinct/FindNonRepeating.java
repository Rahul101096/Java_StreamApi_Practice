//Questions
//1. Remove duplicate integers.
//[10,20,10,30,20]
//
//Output:
//[10,20,30]

package StreamApiPractice.Distinct;

import java.util.List;

public class FindNonRepeating {

    static void main() {
        List<Integer> list= List.of(10,20,10,30,20);

        List<Integer> nonDuplicate=list.stream().distinct().toList();
        System.out.println(nonDuplicate);
    }
}
