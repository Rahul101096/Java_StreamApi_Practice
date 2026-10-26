//find minimum and maximum in the list
package StreamApi;

import java.util.Arrays;
import java.util.List;

public class MinAndMax {
    static void main() {
        List<Integer> list= Arrays.asList(23,38,56,85,94,48,88);
        //find minimum
        int min=list.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println(min);

        //find maximum
        int max=list.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(max);

    }
}
