// constructor reference examples
import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConstructorReferences {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Grace Hopper", "Andi Roobin", "James Bond");

        List<Person> people = names.stream()
                .map(name -> new Person(name))
                .collect(Collectors.toList());

        System.out.println(people);

        List<Person> p2 = names.stream()
                .map(Person::new)   // this is constructor refernce
                .collect(Collectors.toList());

        System.out.println(p2);

        Person before = new Person("Fero Janus");

        //----
        List<Person> p3 = Stream.of(before)
                .collect(Collectors.toList());
        Person after = p3.get(0);


        //----
        List<Person> p4 = Stream.of(before)
                .map(Person::new) // using the copy constructor of Person with constructor reference syntax
                .collect(Collectors.toList());
        Person after2 = p4.get(0);

        before.setName("Oliver Janus");
        System.out.println(after.getName()); // Oliver Janus
        System.out.println(after2.getName());// Fero Janus

        //----
        // using a varargs constructor of Person
        List<Person> p5 = names.stream()
                .map(name -> name.split(" "))
                .map(Person::new)
                .collect(Collectors.toList());
        System.out.println(p5);

        Person[] p6 = names.stream()
                .map(Person::new)
                .toArray(Person[]::new); // constructor reference to an array of Person
        System.out.println(p6.toString());



    }
}
