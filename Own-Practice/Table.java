public class Table{
    public static void main(String [] args) 
    {
        int n = 5; // You can change this value to generate multiplication table for a different number
        System.out.println("Multiplication Table for " + n + ":");
        for(int i = 1; i <= 10; i++) 
        {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    
}
