//11. Check whether none of the strings are empty.

package StreamApiPractice.AnyAllNoneMatch;

import java.util.Arrays;
import java.util.List;

public class CheckEmptyStrings {

    static void main() {
        List<String> listOfStrings= Arrays.asList("Rahul", "Aman", "Vimal", "Addi", "Vikash");

        List<String> listOfStrings1= Arrays.asList("Rahul", "Aman", "", "Vimal", "", "Addi", "Vikash");



        boolean checkEmptyString=listOfStrings.stream().noneMatch(str-> str.isEmpty());
        System.out.println(checkEmptyString);

        boolean checkEmptyString2=listOfStrings.stream().noneMatch(str->str.equals(""));
        System.out.println("Using isEmpty : "+checkEmptyString2);


        System.out.println("====================================================================");
        boolean checkEmptyString1=listOfStrings1.stream().noneMatch(str->str.equals(""));
        System.out.println(checkEmptyString1);

        boolean checkEmptyString3=listOfStrings1.stream().noneMatch(String::isEmpty);
        System.out.println("Using isEmpty : "+checkEmptyString3);

    }
}
