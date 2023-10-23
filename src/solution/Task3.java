package solution;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public String[] SortingAndMergingAnArray(String[] words) {
        return Arrays.stream(words)
                .map(s-> Arrays.stream(s.split(", "))
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(", ")))
                .toArray(String[]::new);
    }
}

//      этот вариант решения мне не понравился, поэтому я решил его переписать
//    public static String[] testTask3(String[] words) {
//        String s = IntStream.range(0, 1)
//                .mapToObj(i -> words[0] + ", " + words[1])
//                .collect(Collectors.joining());
//
//        int[] num = Arrays.stream(s.split(", ")).mapToInt(Integer::parseInt).sorted().toArray();
//        return Arrays.stream(num).mapToObj(n -> n + "")
//                .toArray(String[]::new);
//    }

