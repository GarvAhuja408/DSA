class Main {

    static int beautySum(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {

                freq[s.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {

                    if (freq[k] > 0) {

                        if (freq[k] > max) {
                            max = freq[k];
                        }

                        if (freq[k] < min) {
                            min = freq[k];
                        }
                    }
                }

                total += (max - min);
            }
        }

        return total;
    }

    public static void main(String[] args) {

        String s = "aabcb";

        System.out.println(beautySum(s));
    }
}