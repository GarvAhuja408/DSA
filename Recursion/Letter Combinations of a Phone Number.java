import java.util.*;

class Main {

    static String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void letterCombinations(String digits, int idx,
                                          StringBuilder current,
                                          List<String> result) {

        if (idx == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(idx) - '0'];

        for (char ch : letters.toCharArray()) {
            current.append(ch);
            letterCombinations(digits, idx + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {

        String digits = "23";
        List<String> result = new ArrayList<>();

        if (!digits.isEmpty()) {
            letterCombinations(digits, 0, new StringBuilder(), result);
        }

        System.out.println(result);
    }
}
