import java.util.*;

public class Main {

    public static void subsetSum(int[] arr, int idx, int sum, ArrayList<Integer> ans) {
        if (idx == arr.length) {
            ans.add(sum);
            return;
        }

        subsetSum(arr, idx + 1, sum + arr[idx], ans);
        subsetSum(arr, idx + 1, sum, ans);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        ArrayList<Integer> ans = new ArrayList<>();

        subsetSum(arr, 0, 0, ans);

        Collections.sort(ans);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}