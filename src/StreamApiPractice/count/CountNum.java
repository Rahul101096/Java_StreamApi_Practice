
//1. Count numbers greater than 50.
//2. Count even numbers.
package StreamApiPractice.count;

import java.util.Arrays;
import java.util.List;

public class CountNum {

    static void main() {
        List<Integer> list1= Arrays.asList(10,12,15, 34,28,67,90);
        System.out.println(list1);
        long GreaterThan50=list1.stream().filter(num-> num>50).count();
        System.out.println(GreaterThan50);

        long evenNumCount=list1.stream().filter(num-> num%2==0).count();

        System.out.println("Count of even num : "+evenNumCount);

    }
}
