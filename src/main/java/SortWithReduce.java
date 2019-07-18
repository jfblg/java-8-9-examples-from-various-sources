import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortWithReduce {
    public static void main(String[] args) {
        BigDecimal total = Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE))
                .limit(10)
                .reduce(BigDecimal.ZERO, (acc, val) -> acc.add(val));
        System.out.println("TOTAL: " + total);

        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "words");
        List<String> sorted = strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println("SORTED: " + sorted);
    }
}
