import java.util.Arrays;

class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        Arrays.sort(arr); // sort the array

        System.out.println("Kth smallest element is: " + arr[k - 1]);
    }
}
