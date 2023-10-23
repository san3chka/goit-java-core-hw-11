import solution.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Oleg");
        list.add("Ala");
        list.add("Danil");
        list.add("Vova");
        list.add("Zamir");
        list.add("Mike");
        list.add("Bob");

        System.out.println("задание 1:");
        System.out.println(new Task1().formatOddIndexedNames(list));
        System.out.println("задание 2:");
        System.out.println(new Task2().processAndSortStrings(list));
        System.out.println("задание 3:");
        String[] strings = new String[]{"1, 2, 0", "4, 5"};
        System.out.println(Arrays.toString(new Task3().SortingAndMergingAnArray(strings)));
        System.out.println("задание 4:");
        long a = 25214903917L;
        long c = 11L;
        long m = 2^48L;
        new Task4().getRandom(a, c, m)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("задание 5:");

        Stream<Integer> zippedStream = Task5.zip(Stream.of(1, 2, 3, 4), Stream.of(1, 2, 3, 4));
        zippedStream.forEach(System.out::println);

    }
}
