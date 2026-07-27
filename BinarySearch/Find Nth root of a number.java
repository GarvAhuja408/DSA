class Main {

    static long power(int num, int n) {

        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= num;
        }

        return ans;
    }

    static int nthRoot(int n, int m) {

        int start = 1;
        int end = m;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            long value = power(mid, n);

            if (value == m) {
                return mid;
            } else if (value < m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 27;

        System.out.println(nthRoot(n, m));
    }
}
