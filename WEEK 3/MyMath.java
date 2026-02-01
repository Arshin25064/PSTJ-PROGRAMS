import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    // Check Odd
    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    // Check Prime
    public static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
    }

    // Check Palindrome
    public static PerformOperation isPalindrome() {
        return n -> {
            int temp = n, rev = 0;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            return n == rev;
        };
    }
}

public class MyMath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int choice = sc.nextInt();
            int num = sc.nextInt();

            PerformOperation op;

            if (choice == 1) {
                op = MyMath.isOdd();
                System.out.println(op.check(num) ? "ODD" : "EVEN");
            } 
            else if (choice == 2) {
                op = MyMath.isPrime();
                System.out.println(op.check(num) ? "PRIME" : "COMPOSITE");
            } 
            else if (choice == 3) {
                op = MyMath.isPalindrome();
                System.out.println(op.check(num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}
