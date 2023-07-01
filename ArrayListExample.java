import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements in the ArrayList
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));
        System.out.println("Third fruit: " + fruits.get(2));

        // Updating an element in the ArrayList
        fruits.set(1, "Mango");
        System.out.println("Updated ArrayList: " + fruits);

        // Removing an element from the ArrayList
        fruits.remove(0);
        System.out.println("ArrayList after removal: " + fruits);

        // Checking if an element exists in the ArrayList
        System.out.println("Contains Orange? " + fruits.contains("Orange"));

        // Checking the size of the ArrayList
        System.out.println("Size of the ArrayList: " + fruits.size());

        // Iterating over the elements in the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }
}
