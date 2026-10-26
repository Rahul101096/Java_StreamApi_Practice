package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertLowerToUpper {
    static void main() {
        List<String> list= Arrays.asList("School", "Hyderabad", "Gurugram", "Delhi", "Banglore");
        Stream<String> stream=list.stream();
       List<String> result=stream.map(String::toUpperCase).toList();
        System.out.println(result);
    }
}
