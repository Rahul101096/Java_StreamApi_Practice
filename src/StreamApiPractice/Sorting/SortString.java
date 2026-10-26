//3. Sort strings alphabetically.
package StreamApiPractice.Sorting;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortString {

    static void main() {
        List<String> listOfStrings= List.of("Rahul", "Aman", "Vikas", "Sourabh", "Addi");

        List<String> sortStrings=listOfStrings.stream().sorted().toList();
        System.out.println(sortStrings);
    }
}
