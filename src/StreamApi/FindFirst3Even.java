//find the square of 1st three even numbers in the list
package StreamApi;

import java.util.Arrays;
import java.util.List;

public class FindFirst3Even {
    static void main() {
        List<Integer> list= Arrays.asList(23,12,11,45,34,78,69);
        List<Integer> result=list.stream().filter(i-> i%2==0).limit(3).map(n-> n*n).toList();
        System.out.println(result);
    }
}
