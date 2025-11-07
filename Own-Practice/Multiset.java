import java.util.HashMap;
import java.util.Map;

public class Multiset {
    private Map<String, Integer> elements;

    // Constructor
    public Multiset() {
        elements = new HashMap<>();
    }

    // Add an element (increase count)
    public void add(String item) {
        elements.put(item, elements.getOrDefault(item, 0) + 1);
    }

    // Remove one occurrence of an element
    public void remove(String item) {
        if (elements.containsKey(item)) {
            int count = elements.get(item);
            if (count > 1) {
                elements.put(item, count - 1);
            } else {
                elements.remove(item);
            }
        }
    }

    // Delete all occurrences of an element
    public void deleteAll(String item) {
        elements.remove(item);
    }

    // Count how many times an element appears
    public int count(String item) {
        return elements.getOrDefault(item, 0);
    }

    // Check if element exists
    public boolean contains(String item) {
        return elements.containsKey(item);
    }

    // Total number of elements (including duplicates)
    public int size() {
        int total = 0;
        for (int count : elements.values()) {
            total += count;
        }
        return total;
    }

    // Remove all elements
    public void clear() {
        elements.clear();
    }

    // Display contents
    @Override
    public String toString() {
        return elements.toString();
    }
}
