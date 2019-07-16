import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        String[] strings = "this is an example string".split(" ");

        long count = Arrays.stream(strings)
                .map(String::length)
                .count();
        System.out.println("Count: " + count);

        int totalLength = Arrays.stream(strings)
                .mapToInt(String::length) // sum is on primitive stream only, threfore this transformation
                .sum();
        System.out.println("Total length: " + totalLength);

        // another way of writing a sum using reduce
        int sum2 = IntStream.rangeClosed(1, 10)
                .reduce((x, y) -> x + y).orElse(0);
        System.out.println("Another sum: " + sum2);

        int sum3 = Stream.of(1,2,3,4,5,6,7)
                .reduce(0, Integer::sum);
        System.out.println("Sum3 :" + sum3);


        OptionalDouble avg = Arrays.stream(strings)
                .mapToInt(String::length)
                .average();
        System.out.println("Average: " + avg);

        OptionalInt max = Arrays.stream(strings)
                .mapToInt(String::length)
                .max(); // without comparator only on primitive streams
        System.out.println("Max: " + max);

        OptionalInt min = Arrays.stream(strings)
                .mapToInt(String::length)
                .min(); // without comparator only on primitive streams
        System.out.println("Max: " + min);

        String s = Stream.of("this", "is", "a", "list")
                .reduce("", String::concat);
        System.out.println("Concat: " + s);
        // it is inefficient because String concatenation creates
        //and destroys objects. A better approach would be to use the collect method
        //with a Collector.



    }
}
