public class Main {

    static int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for (int i = 0; i <= n; i++) xor ^= i;
        for (int num : nums) xor ^= num;
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
}
