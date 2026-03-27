import java.util.*;

public class TASK_19 {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Step 3: Keep only k elements
        for (int num : map.keySet()) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;

        while (!pq.isEmpty()) {
            result[i++] = pq.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] res = topKFrequent(nums, k);

        // Print result
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}