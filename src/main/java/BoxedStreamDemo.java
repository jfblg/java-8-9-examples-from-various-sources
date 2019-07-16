// to create a Collection from primitive stream
// boxed() method used to wrap the elements

import java.security.cert.CollectionCertStoreParameters;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedStreamDemo {
    public static void main(String[] args) {

        // converting a stream of strings to Lisf
        List<String> strings = Stream.of("a", "b", "c")
                .collect(Collectors.toList());
        System.out.println(strings);

        // won't compile, because the type is primitive
//        IntStream.of(1,2,3).collect(Collectors.toList());

        List<Integer> ints = IntStream.of(1, 2, 3)
                .boxed()    // convert int to Integer
                .collect(Collectors.toList());
        System.out.println(ints);

        // alternative: use of mapToObj()
        List<Integer> ints2 = IntStream.of(4,5,6)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(ints2);

        // Convert int stream to an int array
        int[] intArray = IntStream.of(1,2,3,4).toArray();

    }
}
