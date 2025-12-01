import java.util.Scanner;
public class accept {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int age=0;
    String name="";
    String district="";

    while (name.isEmpty()){
        System.out.print("Enter your NAME: ");
        name = sc.nextLine();
        if(name.isEmpty()){
            System.out.print("Enter your NAME Please!, ");
            
        }

    }
    while (district.isEmpty()) {
        System.out.print("Enter your district: ");
        district = sc.nextLine();
        if(district.isEmpty()){
            System.out.print("\nEnter your district Please!: ");
        }
        
    }
      
    while (true) {

        System.out.print("Enter your AGE: ");
        if (sc.hasNextInt()){
            age =sc.nextInt();
            break;
        }
        else{
            System.out.print("Enter your AGE Please!: ");
            sc.next();
        
        }}
       
    System.out.println("\nHello Brother, " + name + "!");
    System.out.println("You are " + age + " years old!");
    System.out.println("You are from " + district +" District");
    System.out.println("Have a nice day my friend !");

    sc.close();

}}
 
   