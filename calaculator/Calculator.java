import java.util.Scanner;

public class Calculator {
    public static void  main(String[]args){
        double num1,num2;
        String choice;
        double result;

        Scanner sc =new Scanner(System.in); 

        System.out.println("----------CALCULATOR----------");

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("choose the operator like(+,-,/,* or %): ");
        choice = sc.next();

        System.out.print("Enter  second number: ");
            num2 = sc.nextDouble();

        switch (choice){
            case "+" :
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case "*" :
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "/" :
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            case "%" :
                result = num1 % num2;
                System.out.println("Result: " + result);
                break;
            default :
                System.out.println("Invalid Operator. Try Again!");
                break;
        }


        sc.close();

    }
}
