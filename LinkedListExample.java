import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Printing the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Accessing an element in the LinkedList
        String fruit = linkedList.get(1);
        System.out.println("Fruit at index 1: " + fruit);

        // Updating an element in the LinkedList
        linkedList.set(0, "Mango");
        System.out.println("Updated LinkedList: " + linkedList);

        // Removing an element from the LinkedList
        linkedList.remove(2);
        System.out.println("LinkedList after removal: " + linkedList);

        // Checking if an element exists in the LinkedList
        System.out.println("Contains Banana? " + linkedList.contains("Banana"));

        // Checking the size of the LinkedList
        System.out.println("Size of the LinkedList: " + linkedList.size());

        // Iterating over the elements in the LinkedList
        System.out.println("Iterating over the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
