import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");

        // Printing the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Accessing a value using the key
        String fruit = treeMap.get(1);
        System.out.println("Fruit at key 1: " + fruit);

        // Updating a value in the TreeMap
        treeMap.put(2, "Mango");
        System.out.println("Updated TreeMap: " + treeMap);

        // Removing a key-value pair from the TreeMap
        treeMap.remove(3);
        System.out.println("TreeMap after removal: " + treeMap);

        // Checking if a key exists in the TreeMap
        System.out.println("Contains key 2? " + treeMap.containsKey(2));

        // Checking the size of the TreeMap
        System.out.println("Size of the TreeMap: " + treeMap.size());

        // Iterating over the key-value pairs in the TreeMap
        System.out.println("Iterating over the TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " => " + value);
        }

        // Clearing the TreeMap
        treeMap.clear();
        System.out.println("TreeMap after clearing: " + treeMap);
    }
}
