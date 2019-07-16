import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumersDemo {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");

        strings.forEach(new Consumer<String>() {
                            @Override
                            public void accept(String s) {
                                System.out.println(s);
                            }
                        }
        );

        strings.forEach(x -> System.out.println(x));
        strings.forEach(System.out::println);
    }
}






