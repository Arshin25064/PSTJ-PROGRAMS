import java.util.*;

public class TASK_10 {

    public static int countAnagrams(String text, String pattern) {
        int n = text.length();
        int k = pattern.length();

        if (n < k) return 0;

        int[] pCount = new int[26];
        int[] wCount = new int[26];

        for (char c : pattern.toCharArray()) {
            pCount[c - 'a']++;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
        
            wCount[text.charAt(i) - 'a']++;

            if (i >= k) {
                wCount[text.charAt(i - k) - 'a']--;
            }

            if (Arrays.equals(pCount, wCount)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        String pattern = sc.next();

        System.out.println(countAnagrams(text, pattern));
    }
}