public class OperatorPriority {

    public static void main(String[] args) {
        char operator = '*';
        int priority = getOperatorPriority(operator);
        System.out.println("Priority of operator '" + operator + "': " + priority);
    }

    static int getOperatorPriority(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                // If the operator is not recognized, you may choose to return a default priority
                return 0;
        }
    }
}
