//4. Find the length of every string.
package StreamApiPractice.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LengthOfString {
    static void main() {
        List<String> listOfString= Arrays.asList("Aman", "Rahul", "Aditya", "Ajeet", "Vineet");

        //Approach 1 using Map return type and o/p : {Rahul=5, Vineet=6, Aman=4, Aditya=6, Ajeet=5}
        Map<String, Integer> lengthOfString =listOfString.stream().collect(Collectors.toMap(str-> str, str-> str.length()));
        System.out.println(lengthOfString);

        //Approach 2 using No return type and o/p :
        // Rahul → 5
        //Amit → 4
        //John → 4
        //Priya → 5
        List<String> names = Arrays.asList(
                "Rahul",
                "Amit",
                "John",
                "Priya"
        );

        names.stream()
                .map(str -> str + " → " + str.length())
                .forEach(System.out::println);

        //Approach 3 using List return type and o/p: [5, 4, 4, 5]
        List<Integer> lengths = names.stream()
                .map(str -> str.length())
                .toList();

        System.out.println(lengths);
    }
}
