import java.util.*;

public class Main {

    public static void sortedInsert(Stack<Integer> stack, int data) {

        if (stack.isEmpty() || stack.peek() <= data) {
            stack.push(data);
            return;
        }

        int top = stack.pop();

        sortedInsert(stack, data);

        stack.push(top);
    }

    public static void sortStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        sortStack(stack);

        sortedInsert(stack, top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
