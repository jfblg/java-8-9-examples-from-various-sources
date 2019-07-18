import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstAny {
    public static void main(String[] args) {
        Optional<Integer> firstOdd = Stream.of(2, 4, 6, 3, 1, 7)
                .filter(n -> n % 2 != 0)
                .findFirst();
        System.out.println("First Odd: " + firstOdd);

        Optional<Integer> findAny = Stream.of(2, 4, 6, 3)
                .filter(n -> n % 2 != 0)
                .findAny();
        System.out.println("findAny: " + findAny);
    }
}
