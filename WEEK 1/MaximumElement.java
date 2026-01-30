class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56};
        int n = arr.length;

        int max = arr[0]; // assume first element is maximum

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element in the array is: " + max);
    }
}
