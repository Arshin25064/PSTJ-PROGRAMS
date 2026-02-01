import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }

        int k = sc.nextInt();

        List<Student> topK = students.stream()
                .sorted(Comparator
                        .comparingInt((Student s) -> s.marks).reversed()
                        .thenComparing(s -> s.name))
                .limit(k)
                .collect(Collectors.toList());

        topK.forEach(s -> System.out.print(s.name + " "));
    }
}
