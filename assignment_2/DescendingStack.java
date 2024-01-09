public class DescendingStack {
    private static final int SIZE = 5;
    private int top;
    private int[] stack;

    public DescendingStack() {
        top = SIZE;
        stack = new int[SIZE];
    }

    public void push(int value) {
        if (top > 0) {
            top--;
            stack[top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack Overflow - Cannot push, the stack is full.");
        }
    }

    public void pop() {
        if (top < SIZE) {
            System.out.println("Popped: " + stack[top]);
            top++;
        } else {
            System.out.println("Stack Underflow - Cannot pop, the stack is empty.");
        }
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = top; i < SIZE; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DescendingStack descendingStack = new DescendingStack();

        descendingStack.push(10);
        descendingStack.push(20);
        descendingStack.push(30);
        descendingStack.display();

        descendingStack.pop();
        descendingStack.display();

        descendingStack.push(40);
        descendingStack.display();

        descendingStack.pop();
        descendingStack.pop();
        descendingStack.pop();
        descendingStack.display();
    }
}
