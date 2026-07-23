import java.util.Stack;

class Main {

    static int[] previousSmaller(int[] heights) {

        int n = heights.length;
        int[] left = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = stack.peek();
            }

            stack.push(i);
        }

        return left;
    }

    static int[] nextSmaller(int[] heights) {

        int n = heights.length;
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = stack.peek();
            }

            stack.push(i);
        }

        return right;
    }

    static int largestRectangleArea(int[] heights) {

        int[] left = previousSmaller(heights);
        int[] right = nextSmaller(heights);

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;

            if (area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};

        System.out.println(largestRectangleArea(heights));
    }
}
