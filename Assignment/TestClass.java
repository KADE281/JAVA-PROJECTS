public class TestClass {
    public static void main(String[] args) {
        Multiset m = new Multiset();

        m.add("apple");
        m.add("banana");
        m.add("apple");
        m.add("orange");
        m.add("banana");

        System.out.println("Current Multiset: " + m);
        System.out.println("Count of apple: " + m.count("apple"));
        System.out.println("Contains banana? " + m.contains("banana"));

        m.remove("apple");
        System.out.println("After removing one apple: " + m);

        m.deleteAll("banana");
        System.out.println("After deleting all bananas: " + m);

        System.out.println("Total size: " + m.size());

        m.clear();
        System.out.println("After clearing: " + m);
    }
}
