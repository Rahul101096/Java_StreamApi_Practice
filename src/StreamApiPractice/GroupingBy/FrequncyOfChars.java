package StreamApiPractice.GroupingBy;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequncyOfChars {

    public static void main(String[] args) {

        String str = "Appropriate";

        Map<Character, Long> charFrequency = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        ch -> ch,
                        Collectors.counting()
                ));

        System.out.println(charFrequency);
    }
}