import java.util.*;

class Main {

    public static void combinationSum2(int[] arr, int target, int idx,
                                       List<Integer> current,
                                       List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = idx; i < arr.length; i++) {

            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] > target) {
                break;
            }

            current.add(arr[i]);

            combinationSum2(arr, target - arr[i], i + 1, current, result);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        combinationSum2(arr, target, 0, new ArrayList<>(), result);

        System.out.println(result);
    }
}
