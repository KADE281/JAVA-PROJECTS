import java.util.HashMap;
public class hashmapexample {
    public static void main(String[]args){
        HashMap<Integer,String> nn = new HashMap<>();

        // Adding key-value pairs to the HashMap
        nn.put(1,"Apple");
        nn.put( 2,"Banana");
        nn.put( 3,"Cherry");

        // Displaying the HashMap
        System.out.println("HashMap contents: " +nn);

        // Accessing a value using its key
        String value=nn.containsValue("Banana") ? "Banana" : "Not Found";
        System.out.println("Value for key 'Banana': " + value);
    }
}
