import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add / subtract / multiply / divide): ");
        String op = sc.next();

        double result = 0;

        if (op.equals("add")) {
            result = a + b;
        } else if (op.equals("subtract")) {
            result = a - b;
        } else if (op.equals("multiply")) {
            result = a * b;
        } else if (op.equals("divide")) {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                sc.close();
                return;
            } else {
                result = a / b;
            }
        } else {
            System.out.println("Invalid operation");
            sc.close();
            return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
