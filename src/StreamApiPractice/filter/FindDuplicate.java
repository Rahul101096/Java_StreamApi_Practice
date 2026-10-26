//10. Find duplicate elements from a list using filter().
package StreamApiPractice.filter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
    static void main() {
        List<Integer> list= Arrays.asList(10,14,23,56,23,14,18,36,32);
        Set<Integer> seen=new HashSet<>();
        List<Integer> result=list.stream().filter(num->!seen.add(num)).toList();
        System.out.println(result);
    }
}
