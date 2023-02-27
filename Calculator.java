import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = Scanner.nextDouble();

        System.out.println("Enter the second number:");
        double number2 = Scanner.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        char operator = Scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}
