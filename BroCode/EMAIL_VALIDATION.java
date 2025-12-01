import java .util .Scanner;
public class EMAIL_VALIDATION {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n\nValidation of Email Address.");
        System.out.print("\nEnter your email address: ");
        String email=scanner.nextLine();

        //chech if is valid
        if(email.contains("@") && email.contains(".")){
            System.out.println("Valid email address.");
            System.out.printf("Your email is: %s\n", email);
        } else {
            System.out.println("Invalid email address.");
        }
    

        scanner.close();
}
}
