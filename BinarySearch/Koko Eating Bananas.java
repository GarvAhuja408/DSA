class Main {

    static int totalHours(int[] piles, int speed) {

        int hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
        }

        return hours;
    }

    static int minEatingSpeed(int[] piles, int h) {

        int max = piles[0];

        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }

        int start = 1;
        int end = max;
        int ans = max;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (totalHours(piles, mid) <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println(minEatingSpeed(piles, h));
    }
}