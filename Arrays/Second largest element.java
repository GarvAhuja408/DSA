public class SecondLargestElement {

    static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 20, 3};

        int result = findSecondLargest(arr);

        if (result == -1) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest: " + result);
        }
    }
}
