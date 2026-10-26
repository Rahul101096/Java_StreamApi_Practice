//1. Sort numbers ascending.
//2. Sort numbers descending.
package StreamApiPractice.Sorting;

import java.util.Comparator;
import java.util.List;

public class AscendingDecendingSorting {

    static void main() {
        List<Integer> list= List.of(23,45,32,9,4,2,55,38);

        List<Integer> ascendingOrder= list.stream().sorted().toList();
        System.out.println(ascendingOrder);

        List<Integer> decendingOrder=list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(decendingOrder);
    }
}
