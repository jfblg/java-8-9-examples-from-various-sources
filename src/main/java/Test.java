import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] impactedResource1 = {""};
        String[] impactedResource2 = {"ac", "cd"};

        System.out.println(Stream.of(impactedResource2)
                .map(x -> "\"" + x + "\"")
                .collect(Collectors.joining(", "))
        );


    }
}
