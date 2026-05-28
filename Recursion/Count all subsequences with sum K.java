public class Main {

    public static int countSubsequences(int[] arr, int idx, int sum, int k) {
        if (idx == arr.length) {
            return sum == k ? 1 : 0;
        }

        int include = countSubsequences(arr, idx + 1, sum + arr[idx], k);
        int exclude = countSubsequences(arr, idx + 1, sum, k);

        return include + exclude;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;

        int ans = countSubsequences(arr, 0, 0, k);

        System.out.println(ans);
    }
}
