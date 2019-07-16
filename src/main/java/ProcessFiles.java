import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessFiles {
    public static void main(String[] args) {
        try(Stream<String> lines = Files.lines(Paths.get("web2.txt"))) {
            lines.filter(s -> s.length() > 20)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .limit(10)
                    .forEach(w -> System.out.printf("%s (%d)%n", w, w.length()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // print count of the words of the same length
        try(Stream<String> lines = Files.lines(Paths.get("web2.txt"))) {
            lines.filter(w -> w.length() > 30)
                    .collect(Collectors.groupingBy(String::length, Collectors.counting()))
                    .forEach((len, num) -> System.out.println(len + ": " + num));
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
