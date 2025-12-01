import java.io.Console;

class console {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Console is not available.");
            return;
        }

        String name = console.readLine("Enter your name: ");
        char[] pass = console.readPassword("Enter password: ");

        System.out.println("Welcome, " + name);
        System.out.println("Your password length is: " + pass.length);
    }
}
