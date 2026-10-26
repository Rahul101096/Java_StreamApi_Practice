package StreamApiPractice.flatMap;

import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<List<Integer>> arr = List.of(
                List.of(23, 45, 6),
                List.of(13, 42, 78),
                List.of(69, 56)
        );

        List<Integer> result = arr.stream()
                .flatMap(list -> list.stream())
                .toList();

        System.out.println(result);
    }
}