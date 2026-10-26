//2. Remove duplicate strings.

package StreamApiPractice.Distinct;

import java.util.List;

public class RemoveDuplicates {

    static void main() {
        List<String> list= List.of("cat", "dog", "mouse", "Lion", "cat", "mouse");

        List<String> result=list.stream().distinct().toList();
        System.out.println(result);
    }
}
