import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Static method for filtering
    public static boolean isOlderThanLimit(Person p, int limit) {
        return p.age > limit;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            persons.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt();

        // 1. Sort alphabetically using method reference
        List<Person> sortedList = persons.stream()
                .sorted(Comparator.comparing(p -> p.name))
                .collect(Collectors.toList());

        for (Person p : sortedList) {
            System.out.print(p.name + " ");
        }
        System.out.println();

        // 2. Filter older than limit using static method reference
        persons.stream()
                .filter(p -> Person.isOlderThanLimit(p, ageLimit))
                .forEach(p -> System.out.print(p.name + " "));
        System.out.println();

        //3. Convert to uppercase using instance method reference
        persons.stream()
                .map(p -> p.name)
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
    }
}
