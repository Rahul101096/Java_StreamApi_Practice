//5. Count strings having length > 5.

package StreamApiPractice.count;

import java.util.Arrays;
import java.util.List;

public class CountStringLength {

    static void main() {
        List<String> str= Arrays.asList("Rahul", "Aman", "Addi", "Vivek", "Vikash", "Ajay", "Manjeet");

        long empCount=str.stream().filter(strLen-> strLen.length()>5).count();
        System.out.println(empCount);
    }
}
