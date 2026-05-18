class Solution {

    public static int singleNumber(int[] arr) {

        int ans = 0;

        for(int num : arr) {
            ans = ans ^ num;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        System.out.println(singleNumber(arr));
    }
}
