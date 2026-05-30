import java.util.*;

public class Main {

    public static void subsets(int[] nums, int idx, List<Integer> curr, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(curr));

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }

            curr.add(nums[i]);
            subsets(nums, i + 1, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        subsets(nums, 0, new ArrayList<>(), ans);

        System.out.println(ans);
    }
}
