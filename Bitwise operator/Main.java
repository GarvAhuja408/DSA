public class Main {
    public static boolean isSet(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        int num = 10;
        int i = 1;
        System.out.println(isSet(num,i));
    }
}