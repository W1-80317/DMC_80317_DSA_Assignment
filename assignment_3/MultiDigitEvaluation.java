import java.util.Scanner;
import java.util.Stack;

public class MultiDigitEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Postfix Evaluation");
            System.out.println("2. Prefix Evaluation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a postfix expression: ");
                    String postfixExpression = scanner.nextLine();
                    int resultPostfix = evaluatePostfix(postfixExpression);
                    System.out.println("Result: " + resultPostfix);
                    break;
                case 2:
                    System.out.print("Enter a prefix expression: ");
                    String prefixExpression = scanner.nextLine();
                    int resultPrefix = evaluatePrefix(prefixExpression);
                    System.out.println("Result: " + resultPrefix);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    private static int evaluatePostfix(String postfixExpression) {
        Stack<Integer> stack = new Stack<>();

        for (char c : postfixExpression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    // Add more operators as needed
                }
            }
        }

        return stack.pop();
    }

    private static int evaluatePrefix(String prefixExpression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = prefixExpression.length() - 1; i >= 0; i--) {
            char c = prefixExpression.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    // Add more operators as needed
                }
            }
        }

        return stack.pop();
    }
}
