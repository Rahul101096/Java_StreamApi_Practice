//Find duplicate in the list
package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatInList {


    static void main() {
        List<Integer> list= Arrays.asList(12, 32, 45, 52, 22, 32, 40);
        Set<Integer> items=new HashSet<>();
        Set<Integer> duplicate=list.stream().filter(i-> !items.add(i)).collect(Collectors.toSet());
        System.out.println(duplicate);
    }
}
