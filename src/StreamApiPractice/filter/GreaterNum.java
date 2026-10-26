//Find numbers greater than 50.
package StreamApiPractice.filter;

import java.util.Arrays;
import java.util.List;

public class GreaterNum {
    static void main() {
        List<Integer> list= Arrays.asList(23,45,64,13,42,78,69,55);
        List<Integer> result=list.stream().filter(i-> i>50).toList();
        System.out.println(result);
    }
}
