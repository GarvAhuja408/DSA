class Main {

    static String frequencySort(String s) {

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        StringBuilder ans = new StringBuilder();

        while (true) {

            int max = 0;
            int index = -1;

            for (int i = 0; i < 256; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    index = i;
                }
            }

            if (index == -1) {
                break;
            }

            for (int i = 0; i < max; i++) {
                ans.append((char) index);
            }

            freq[index] = 0;
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
