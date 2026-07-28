class Main {

    static int daysRequired(int[] weights, int capacity) {

        int days = 1;
        int load = 0;

        for (int weight : weights) {

            if (load + weight > capacity) {
                days++;
                load = weight;
            } else {
                load += weight;
            }
        }

        return days;
    }

    static int shipWithinDays(int[] weights, int days) {

        int max = weights[0];
        int sum = 0;

        for (int weight : weights) {

            if (weight > max) {
                max = weight;
            }

            sum += weight;
        }

        int start = max;
        int end = sum;
        int ans = sum;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (daysRequired(weights, mid) <= days) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        System.out.println(shipWithinDays(weights, days));
    }
}