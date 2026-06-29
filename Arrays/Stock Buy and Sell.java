class Main {
    public static int maxProfit(int[] arr) {

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < arr.length; i++) {

            min = Math.min(min, arr[i]);

            profit = Math.max(profit, arr[i] - min);
        }
        return profit;
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
        
    }
}
