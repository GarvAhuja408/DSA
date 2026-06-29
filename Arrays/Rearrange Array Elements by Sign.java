import java.util.*;

class Main {
    public static int[] rearrange(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int pos = 0, neg = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                res[pos] = arr[i];
                pos += 2;
            } else {
                res[neg] = arr[i];
                neg += 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] res = rearrange(arr);
        System.out.println(Arrays.toString(res));
    }
}
