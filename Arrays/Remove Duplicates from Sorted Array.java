import java.util.*;

public class Main {
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}