import java.util.*;

class Main {

    public static void combinationSum3(int k, int n, int start,
                                       List<Integer> current,
                                       List<List<Integer>> result) {

        if (current.size() == k) {
            if (n == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > n) {
                break;
            }

            current.add(i);
            combinationSum3(k, n - i, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int k = 3;
        int n = 7;

        List<List<Integer>> result = new ArrayList<>();

        combinationSum3(k, n, 1, new ArrayList<>(), result);

        System.out.println(result);
    }
}
