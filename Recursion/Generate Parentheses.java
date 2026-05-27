import java.util.*;

class Main {

    public static void solve(int open, int close, String ans, List<String> res) {

        if(open == 0 && close == 0) {
            res.add(ans);
            return;
        }

        if(open > 0) {
            solve(open - 1, close, ans + "(", res);
        }

        if(close > open) {
            solve(open, close - 1, ans + ")", res);
        }
    }

    public static void main(String[] args) {

        int n = 3;

        List<String> res = new ArrayList<>();

        solve(n, n, "", res);

        System.out.println(res);
    }
}