class Main {

    static int findSum(int[] nums, int divisor) {

        int sum = 0;

        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
        }

        return sum;
    }

    static int smallestDivisor(int[] nums, int threshold) {

        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        int start = 1;
        int end = max;
        int ans = max;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (findSum(nums, mid) <= threshold) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        System.out.println(smallestDivisor(nums, threshold));
    }
}
