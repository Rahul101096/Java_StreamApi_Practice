//2. Convert a list of strings to uppercase.
//3. Convert a list of strings to lowercase.
package StreamApiPractice.map;

import java.util.Arrays;
import java.util.List;

public class ToUpperAndToLower {
    static void main() {
        List<String> listOfString= Arrays.asList("Aman", "Rahul", "Aditya", "Ajeet", "Vineet");

        List<String> toLower=listOfString.stream().map(String::toLowerCase).toList();
        System.out.println(toLower);
        List<String> toUpper=listOfString.stream().map(String::toUpperCase).toList();
        System.out.println(toUpper);
    }
}
