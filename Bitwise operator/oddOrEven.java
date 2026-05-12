public class Main {
    public static boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    public static void main(String[] args) {
        int num = 7;

        if (isOdd(num))
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
