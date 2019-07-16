import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMethods {
    public static void main(String[] args) {
        String names = Stream.of("Name1", "Name2", "Name3").collect(Collectors.joining(","));
        System.out.println(names);

        // Creating a stream with Arrays.stream - you have to create an array ahead of time
        String[] musters = {"Name4", "Name5", "Name6"};
        names = Arrays.stream(musters).collect(Collectors.joining(","));
        System.out.println(names);

        // Stream.iterate

        List<BigDecimal> nums =
                Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE))
                        .limit(10)
                        .collect(Collectors.toList());
        System.out.println(nums);

        Stream.iterate(LocalDate.now(), ld -> ld.plusDays(1))
                .limit(10)
                .forEach(System.out::println);

        // Stream.generate
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

        // Creating a stream from Collection
        List<String> brandyBrunch = Arrays.asList("Name10", "Name11", "Name12");
        String names2 = brandyBrunch.stream()
                .collect(Collectors.joining(", "));
        System.out.println(names2);

        // Instream - range, rangeClosed
        List<Integer> ints = IntStream.range(10, 20)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(ints);

        List<Integer> intsClosed = IntStream.rangeClosed(10, 20)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(intsClosed);

    }
}
