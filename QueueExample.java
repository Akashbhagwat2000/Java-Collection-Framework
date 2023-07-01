import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("John");
        queue.add("Jane");
        queue.add("Alice");

        // Printing the Queue
        System.out.println("Queue: " + queue);

        // Accessing the front element of the Queue
        String front = queue.peek();
        System.out.println("Front element: " + front);

        // Removing an element from the Queue
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        // Adding elements to the Queue using the offer() method
        queue.offer("Bob");
        System.out.println("Queue after offer: " + queue);

        // Checking if an element exists in the Queue
        boolean containsJane = queue.contains("Jane");
        System.out.println("Contains Jane? " + containsJane);

        // Checking the size of the Queue
        int size = queue.size();
        System.out.println("Size of the Queue: " + size);

        // Iterating over the elements in the Queue
        System.out.println("Iterating over the Queue:");
        for (String element : queue) {
            System.out.println(element);
        }

        // Clearing the Queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}
