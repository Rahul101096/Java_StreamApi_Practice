//5. Find duplicate numbers using distinct().
package StreamApiPractice.Distinct;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindDuplicate {

    static void main() {
        List<Integer> list=List.of(1,2,3,4,1,2,3,5);

        List<Integer> duplicates=list.stream().filter(n-> Collections.frequency(list, n)>1).distinct().toList();
        System.out.println(duplicates);
    }
}
