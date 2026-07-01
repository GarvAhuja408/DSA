import java.util.*;

class Main {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = buildSet(nums);
        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int length = countSequence(set, num);
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static HashSet<Integer> buildSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return set;
    }

    public static int countSequence(HashSet<Integer> set, int start) {
        int length = 1;

        while (set.contains(start + 1)) {
            start++;
            length++;
        }

        return length;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
