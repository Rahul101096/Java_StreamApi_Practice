//1. Convert a list of integers into their squares.
package StreamApiPractice.map;

import java.util.Arrays;
import java.util.List;

public class SquareOfEachElem {
    static void main() {
        List<Integer> list= Arrays.asList(2,5,3,7,8,12,8);
        List<Integer> result=list.stream().map(i->i*i).toList();
        System.out.println(result);
    }
}
