import java.util.Scanner;
import java.util.Random;

public class area{
public static void main(String []args){
    System.out.println("Solve the following Problems:");
    Scanner scanner=new Scanner(System.in);
    Random random = new Random();

    int radius;
    int a;
    double c;
    int b;
    
    System.out.println("Calculate the area of circumference.");
    System.out.print("\nEnter the radius: ");
    radius=scanner.nextInt();
    double circumference=Math.ceil(2*radius*Math.PI);
    
    System.out.println("Calculate the Hypothenus of Triangle.");
    System.out.print("Enter value of side A : ");
    a=scanner.nextInt();
    System.out.print("Enter value of side B : ");
    b=scanner.nextInt();
    c=Math.ceil(Math.sqrt(a*a + b*b));
    int randomNum = random.nextInt(1,101);


    System.out.println("\nThe area of circumference is: " +circumference+" Cm");
    System.out.println("The value of Hypothenus is: " +c+" Cm");
    System.out.println("\nYour Random Number is: " +randomNum+"\n");
    double price=12.894;
    System.out.printf("You have topay this amount: % .2f$ ",price );









    
    scanner.close();
    
  
    
}}