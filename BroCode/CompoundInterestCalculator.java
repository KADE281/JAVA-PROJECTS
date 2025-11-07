import java.util.Scanner;

public class CompoundInterestCalculator{
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        //Compound interestformula A=P(1+r/n)^(nt)  where n is the number of times that interest is compounded per year
        System.out.println("\nCompound interest after a given years\n");
        double amount;
        double principal;
        double rate;
        int time;
        int n;
        System.out.print("Enter the principal amount: ");
        principal=scanner.nextDouble();

        System.out.print("Enter the rate of interest (in %): ");
        rate=scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        time= scanner.nextInt();

        System.out.print("Enter the value of n: ");
        n=scanner.nextInt();
        amount=principal*Math.pow(1+(rate/n),n*time);

        System.out.printf("The compound inerest after %d years is : %.2fRWF",time,amount);
        System.out.println("\n\nTHANK YOU FOR USING OUR SERVICES!\n");

        
        scanner.close();  
}}