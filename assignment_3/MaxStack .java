import java.util.EmptyStackException;

public class MaxStack {
    private int[] stack;
    private int[] maxStack;
    private int top;

    public MaxStack(int capacity) {
        stack = new int[capacity];
        maxStack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
            return;
        }

        top++;
        stack[top] = value;
        if (top == 0 || value >= maxStack[top - 1]) {
            maxStack[top] = value;
        } else {
            maxStack[top] = maxStack[top - 1];
        }
    }

    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }

        int poppedValue = stack[top];
        top--;
        return poppedValue;
    }

    public int getMax() {
        if (top == -1) {
            throw new EmptyStackException();
        }

        return maxStack[top];
    }

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack(5);

        // Pushing 5 elements into the stack
        maxStack.push(3);
        maxStack.push(7);
        maxStack.push(1);
        maxStack.push(5);
        maxStack.push(2);

        // Finding the maximum value in the stack
        int max = maxStack.getMax();
        System.out.println("Maximum value in the stack: " + max);
    }
}
