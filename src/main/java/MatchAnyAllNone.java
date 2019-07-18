import java.util.stream.IntStream;

public class MatchAnyAllNone {
    public static void main(String[] args) {
        System.out.println("Is 342 prime? : " + isPrime(342));
        System.out.println("Is 17 prime? : " + isPrime(17));



    }

    public static boolean isPrime(int num) {
        int limit = (int) (Math.sqrt(num) + 1);
        return num == 2 || num > 2 && IntStream.range(2, limit)
                .noneMatch(devisor -> num % devisor == 0);
    }
}
