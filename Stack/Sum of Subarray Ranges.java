import java.util.Stack;

class Main {

    static long[] previousSmaller(int[] nums) {
g
        int n = nums.length;
        long[] left = new long[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return left;
    }

    static long[] nextSmaller(int[] nums) {

        int n = nums.length;
        long[] right = new long[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return right;
    }

    static long[] previousGreater(int[] nums) {

        int n = nums.length;
        long[] left = new long[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return left;
    }

    static long[] nextGreater(int[] nums) {

        int n = nums.length;
        long[] right = new long[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        return right;
    }

    static long subArrayRanges(int[] nums) {

        long[] minLeft = previousSmaller(nums);
        long[] minRight = nextSmaller(nums);
        long[] maxLeft = previousGreater(nums);
        long[] maxRight = nextGreater(nums);

        long minSum = 0;
        long maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            minSum += (long) nums[i] * minLeft[i] * minRight[i];
            maxSum += (long) nums[i] * maxLeft[i] * maxRight[i];
        }

        return maxSum - minSum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        System.out.println(subArrayRanges(nums));
    }
}
