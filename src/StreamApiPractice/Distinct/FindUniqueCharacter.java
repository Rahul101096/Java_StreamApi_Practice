//3. Find unique characters in a string.
package StreamApiPractice.Distinct;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FindUniqueCharacter {

    static void main() {
        String input = "programming";

        List<Character> result = input.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .toList();

        System.out.println(result);

    }
}
