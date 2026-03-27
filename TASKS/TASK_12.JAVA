import java.util.*;

public class TASK_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder result = new StringBuilder();

        int n = s.length();
        int count = 1;

        for (int i = 1; i <= n; i++) {

            // Count consecutive characters
            if (i < n && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                char ch = s.charAt(i - 1);

                // Convert count to hexadecimal (lowercase)
                String hex = Integer.toHexString(count);

                result.append(ch).append(hex);

                count = 1;
            }
        }

        result.reverse();

        System.out.println(result.toString());
    }
}