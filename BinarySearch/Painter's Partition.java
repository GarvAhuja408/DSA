class Main {

    public static int paintersRequired(int[] boards, int maxLength) {
        int painters = 1;
        int sum = 0;

        for (int board : boards) {
            if (sum + board <= maxLength) {
                sum += board;
            } else {
                painters++;
                sum = board;
            }
        }

        return painters;
    }

    public static int painterPartition(int[] boards, int painters) {
        int low = 0;
        int high = 0;

        for (int board : boards) {
            low = Math.max(low, board);
            high += board;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (paintersRequired(boards, mid) <= painters) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int painters = 2;

        System.out.println(painterPartition(boards, painters));
    }
}