import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Printing the HashSet
        System.out.println("HashSet: " + set);

        // Checking if an element exists in the HashSet
        System.out.println("Contains Orange? " + set.contains("Orange"));

        // Removing an element from the HashSet
        set.remove("Banana");
        System.out.println("HashSet after removal: " + set);

        // Checking the size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());

        // Iterating over the elements in the HashSet
        System.out.println("Iterating over the HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Clearing the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}
