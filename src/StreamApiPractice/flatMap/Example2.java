//2. Given:
//List<List<String>>
//
//convert it into:
//List<String>

package StreamApiPractice.flatMap;

import java.util.List;

public class Example2 {

    static void main() {
        List<List<String>> str=List.of(
                List.of("Rshul", "Aman"),
                List.of("Ajeet", "Aditya"),
                List.of("Vikash", "Vimal"));

        List<String> result=str.stream().flatMap(st-> st.stream()).toList();

        System.out.println(result);
    }
}
