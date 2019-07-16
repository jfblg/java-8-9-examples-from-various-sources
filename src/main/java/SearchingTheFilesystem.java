import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class SearchingTheFilesystem {
    public static void main(String[] args) {
        try (Stream<Path> paths = Files.find(Paths.get("src"), Integer.MAX_VALUE,
                (path, att) -> !att.isDirectory() && path.toString().contains(("java")))) {
            paths.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
