class Main {

    static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] mapST = new char[256];
        char[] mapTS = new char[256];

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST[c1] == 0 && mapTS[c2] == 0) {
                mapST[c1] = c2;
                mapTS[c2] = c1;
            } else if (mapST[c1] != c2 || mapTS[c2] != c1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));
    }
}