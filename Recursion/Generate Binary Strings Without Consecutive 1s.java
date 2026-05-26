import java.util.*;

class Main {
    
    public static void generate(int n, String ans, List<String> res) {
        if(ans.length() == n) {
            res.add(ans);
            return;
        }

        generate(n, ans + "0", res);

        if(ans.length() == 0 || ans.charAt(ans.length() - 1) != '1') {
            generate(n, ans + "1", res);
        }
    }

    public static void main(String[] args) {
        int n = 3;

        List<String> res = new ArrayList<>();

        generate(n, "", res);

        System.out.println(res);
    }
}
