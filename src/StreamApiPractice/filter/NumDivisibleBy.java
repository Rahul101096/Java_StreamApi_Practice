//11. Find numbers that are divisible by both 3 and 5.
package StreamApiPractice.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumDivisibleBy {
    static void main() {
        List<Integer> list= Arrays.asList(10,14,23,56,23,14,18,36,32);

        List<Integer> result=list.stream().filter(num->num%3==0 && num%5==0).toList();
        System.out.println(result);
    }
}
