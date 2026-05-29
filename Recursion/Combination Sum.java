import java.util.*;

class Main {

    public static void combinationSum(int[] arr, int target, int idx,
                                      List<Integer> current,
                                      List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (idx == arr.length || target < 0) {
            return;
        }

        current.add(arr[idx]);
        combinationSum(arr, target - arr[idx], idx, current, result);
        current.remove(current.size() - 1);

        combinationSum(arr, target, idx + 1, current, result);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = new ArrayList<>();

        combinationSum(arr, target, 0, new ArrayList<>(), result);

        System.out.println(result);
    }
}
