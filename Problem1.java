import java.util.Scanner;

class Calculator {
    private double a;
    private double b;
    private String operation;
    
    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        double result = 0.0;
        
        if (operation.equals("addition")) {
            result = a + b;
        } else if (operation.equals("subtraction")) {
            result = a - b;
        } else if (operation.equals("multiplication")) {
            result = a * b;
        } else if (operation.equals("division")) {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operation");
        }
        
        return result;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter first number a : ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number b : ");
        double b = scanner.nextDouble();

        System.out.println("Enter operation (addition / subtraction / multiplication / division):");
        String operation = scanner.next().toLowerCase();

        Calculator calc = new Calculator(a, b, operation);
        System.out.println("Result: " + calc.calculate());

        scanner.close();
    }
}
