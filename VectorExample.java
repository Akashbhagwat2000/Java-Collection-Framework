import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Printing the Vector
        System.out.println("Vector: " + vector);

        // Accessing an element in the Vector
        String fruit = vector.get(1);
        System.out.println("Fruit at index 1: " + fruit);

        // Updating an element in the Vector
        vector.set(0, "Mango");
        System.out.println("Updated Vector: " + vector);

        // Removing an element from the Vector
        vector.remove(2);
        System.out.println("Vector after removal: " + vector);

        // Checking if an element exists in the Vector
        boolean containsBanana = vector.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // Checking the size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);

        // Iterating over the elements in the Vector
        System.out.println("Iterating over the Vector:");
        for (String element : vector) {
            System.out.println(element);
        }

        // Clearing the Vector
        vector.clear();
        System.out.println("Vector after clearing: " + vector);
    }
}
