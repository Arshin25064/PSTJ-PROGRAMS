import java.util.*;
import java.util.stream.*;

public class secondHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Integer secondHighest = list.stream()
                .distinct()                      // remove duplicates
                .sorted(Comparator.reverseOrder()) // sort descending
                .skip(1)                         // skip highest
                .findFirst()                     // take second highest
                .orElse(-1);                     // if not exist

        System.out.println(secondHighest);
    }
}
