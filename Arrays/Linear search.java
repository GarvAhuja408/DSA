import java.util.*;

public class LinearSearch {

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 5, 60};
        int target = 5;

        int result = search(arr, target);

        if (result != -1)
            System.out.println(result);
        else
            System.out.println(-1);
    }
}