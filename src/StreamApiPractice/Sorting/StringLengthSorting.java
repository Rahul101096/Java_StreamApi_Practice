//4. Sort strings by length.
package StreamApiPractice.Sorting;

import java.util.List;
import java.util.Comparator;

public class StringLengthSorting {

    public static void main(String[] args) {

        List<String> names = List.of(
                "Rahul",
                "Amit",
                "Saurabh",
                "Priya",
                "John"
        );

        List<String> sortedNames = names.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println(sortedNames);
    }
}