public class CheckArraySorted {

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};

        if (isSorted(arr)) {
            System.out.println("YES, Sorted");
        } else {
            System.out.println("NO, Not Sorted");
        }
    }
}
