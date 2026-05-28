public class Main {

    public static boolean checkSubsequence(int[] arr, int idx, int sum, int k) {
        if (idx == arr.length) {
            return sum == k;
        }

        if (checkSubsequence(arr, idx + 1, sum + arr[idx], k)) {
            return true;
        }

        if (checkSubsequence(arr, idx + 1, sum, k)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;

        boolean ans = checkSubsequence(arr, 0, 0, k);

        System.out.println(ans);
    }
}
