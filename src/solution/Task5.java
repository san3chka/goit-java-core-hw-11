package solution;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> concat = Stream.concat(first, second).collect(Collectors.toList());
        Collections.shuffle(concat);
        return concat.stream();
    }
}
