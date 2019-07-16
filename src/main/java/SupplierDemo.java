import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.stream.Collectors;

public class SupplierDemo {
    public static void main(String[] args) {
        DoubleSupplier randomSupplier = () -> Math.random();
        randomSupplier = Math::random;

        System.out.println(randomSupplier);

        List<String> names = Arrays.asList("Mal", "Wash", "Kaylee", "Inara",
                "Zoë", "Jayne", "Simon", "River", "Shepherd Book");

        Optional<String> first = names.stream().filter(n -> n.startsWith("C")).findFirst();

        System.out.println(first);

        System.out.println(first.orElse("None"));

        // Note: orElseGet executes only when first is empty i.e. deferred execution
        System.out.println(first.orElseGet(() ->
                String.format("No results found in %s",
                        names.stream().collect(Collectors.joining(", ")))));
    }
}
