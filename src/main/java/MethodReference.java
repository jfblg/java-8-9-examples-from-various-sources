import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReference {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).forEach(x -> System.out.println(x));
        Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);

        // assigning method reference to a functional interface
        Consumer<Integer> printer = System.out::println;
        Stream.of(1, 2, 3, 4, 5).forEach(printer);

        // method reference can be used with lambda expression
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        // invoke a multiple-argument instance method from a class reference
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        List<String> sorted = strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());
        System.out.println(sorted);

        System.out.println("------");
        // invoke a multiple-argument instance method from a class reference
        List<String> sorted2 = strings.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        System.out.println(sorted2);

        Stream.of("a", "aa", "aaa")
                .map(String::length).forEach(System.out::println);
    }
}
