import java.util.*;
import java.io.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Check Odd/Even
    PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    // Check Prime
    PerformOperation isPrime() {
        return (int a) -> {
            if (a < 2) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    // Check Palindrome
    PerformOperation isPalindrome() {
        return (int a) -> {
            int original = a, reversed = 0;
            while (a > 0) {
                reversed = reversed * 10 + (a % 10);
                a /= 10;
            }
            return original == reversed;
        };
    }
}

public class TASK_2 {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int ch = sc.nextInt();
            int num = sc.nextInt();

            PerformOperation op;
            boolean result;

            if (ch == 1) {
                op = ob.isOdd();
                result = MyMath.checker(op, num);
                System.out.println(result ? "ODD" : "EVEN");
            }
            else if (ch == 2) {
                op = ob.isPrime();
                result = MyMath.checker(op, num);
                System.out.println(result ? "PRIME" : "COMPOSITE");
            }
            else if (ch == 3) {
                op = ob.isPalindrome();
                result = MyMath.checker(op, num);
                System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}