import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.println("Available Operations: +, -, *, /, %, ^ (power), $ (square root)");
        System.out.println("Note: For square root, only the first number is considered.");

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %, ^, $): ");
        char operator = scanner.next().charAt(0);

        double num2 = 0; // Initialize num2 as 0
        if (operator != '$') {
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();
        }

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            case '^':
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '$':
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot calculate the square root of a negative number!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
        scanner.close();
    }
}
