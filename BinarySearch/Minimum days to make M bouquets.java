class Main {

    static boolean canMake(int[] bloomDay, int day, int m, int k) {

        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                flowers++;
            } else {
                bouquets += flowers / k;
                flowers = 0;
            }
        }

        bouquets += flowers / k;

        return bouquets >= m;
    }

    static int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int min = bloomDay[0];
        int max = bloomDay[0];

        for (int bloom : bloomDay) {

            if (bloom < min) {
                min = bloom;
            }

            if (bloom > max) {
                max = bloom;
            }
        }

        int start = min;
        int end = max;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (canMake(bloomDay, mid, m, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;

        System.out.println(minDays(bloomDay, m, k));
    }
}
