import java.util.Scanner;

class switch1 {

    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the Day of week : ");

        String day=scanner.nextLine().toLowerCase();
        switch(day){
            case "monday","tuesday","wednesday","thursday","friday" -> 
                System.out.println("It's  week day");
            case "saturday","sunday" ->
                System.out.println("It's weekend Day");
            default ->
                System.out.println(day.toUpperCase() +" is not a Day.");

        }
        scanner.close();

    }
}
