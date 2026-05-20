class Solution {

    public static double myPow(double x, int n) {

        long N = n;

        if(N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }

    public static double power(double x, long n) {

        if(n == 0) {
            return 1;
        }

        double half = power(x, n / 2);

        if(n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(myPow(x,n));
    }
}