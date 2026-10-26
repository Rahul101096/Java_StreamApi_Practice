//Find all odd numbers from a list.
package StreamApiPractice.filter;

import java.util.Arrays;
import java.util.List;

public class OddNum {
    static void main() {
        List<Integer> list= Arrays.asList(23,45,64,13,42,78,69,55);
        List<Integer> result=list.stream().filter(i ->i%2 !=0).toList();
        System.out.println(result);
    }
}
