import java.util.Arrays;
import java.util.stream.Collectors;

public class Person {
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(Person p) {
        this.name = p.name;
    }

    // varargs constructor
    public Person(String... names) {
        this.name = Arrays.stream(names).collect(Collectors.joining(" "));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\"Person\"{" +
                "\"name\":'" + name + '\'' +
                '}';
    }
}
