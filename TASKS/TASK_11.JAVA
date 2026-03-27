import java.util.*;

public class TASK_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        for (int i = 0; i < N; i++) {
            int Ai = sc.nextInt();

            if (Ai % K == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}