import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountElements {
    public static void main(String[] args) {
        long count = Stream.of(1,2,3,4,5).count();
        System.out.println(count);

        count = Stream.of(1,2,3,4,5,6)
                .collect(Collectors.counting());
        System.out.println(count);

    }
}
