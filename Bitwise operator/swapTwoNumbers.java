class Swap {
    
    void swapNumbers(int a, int b) {
        
        System.out.println("Before Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Swap obj = new Swap();
        obj.swapNumbers(3, 5);
    }
}
