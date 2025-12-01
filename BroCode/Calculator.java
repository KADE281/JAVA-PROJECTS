import java.util.Scanner;

public class Calculator {
    public static void  main(String[]args){
        double num1,num2;
        String choice;
        double result;

        Scanner scanner=new Scanner(System.in);
        System.out.println("----------CALCULATOR----------");
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("choose the operator like(+,-,/,* or %): ");
        choice = scanner.next();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (choice) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid Operator. Try Again!");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);


        scanner.close();

    }
}
