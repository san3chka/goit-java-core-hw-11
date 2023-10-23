package solution;

import java.util.stream.Stream;

public class Task4 {
    public Stream<Long> getRandom(long a, long c, long m) {
        return Stream.iterate(0L, x -> (a * x + c) % m );
    }
}
