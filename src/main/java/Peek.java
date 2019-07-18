import java.util.stream.IntStream;

public class Peek {
    public static void main(String[] args) {
        System.out.println("Sum: " + sumDoublesDivisebleBy3(1, 20));

    }

    public static int sumDoublesDivisebleBy3(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .peek(n -> System.out.printf("1. stage: %d%n", n))
                .map(n -> n*2)
                .peek(n -> System.out.printf("2. stage: %d%n", n))
                .filter(n -> n % 3 == 0)
                .peek(n -> System.out.printf("3. stage: %d%n", n))
                .sum();
    }
}
