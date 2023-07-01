import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Alice", 28);

        // Printing the HashMap
        System.out.println("HashMap: " + map);

        // Accessing a value using the key
        int johnsAge = map.get("John");
        System.out.println("John's age: " + johnsAge);

        // Updating a value in the HashMap
        map.put("Jane", 32);
        System.out.println("Updated HashMap: " + map);

        // Removing a key-value pair from the HashMap
        map.remove("Alice");
        System.out.println("HashMap after removal: " + map);

        // Checking if a key exists in the HashMap
        System.out.println("Contains Jane? " + map.containsKey("Jane"));

        // Checking if a value exists in the HashMap
        System.out.println("Contains age 28? " + map.containsValue(28));

        // Checking the size of the HashMap
        System.out.println("Size of the HashMap: " + map.size());

        // Iterating over the key-value pairs in the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " => " + value);
        }

        // Clearing the HashMap
        map.clear();
        System.out.println("HashMap after clearing: " + map);
    }
}
