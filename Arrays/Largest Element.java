public class LargestElement {

    static int findLargest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 15, 6};

        int result = findLargest(arr);
        System.out.println("Largest Element: " + result);
    }
}
