import java.util.*;

public class Main {
    public static void subsequences(String str, int idx, String curr, ArrayList<String> ans) {
        if (idx == str.length()) {
            ans.add(curr);
            return;
        }

        subsequences(str, idx + 1, curr + str.charAt(idx), ans);
        subsequences(str, idx + 1, curr, ans);
    }

    public static void main(String[] args) {
        String str = "abc";

        ArrayList<String> ans = new ArrayList<>();

        subsequences(str, 0, "", ans);

        for (String s : ans) {
            System.out.println(s);
        }
    }
}
