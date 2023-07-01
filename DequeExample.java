import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        // Creating a Deque
        Deque<String> deque = new LinkedList<>();

        // Adding elements to the front of the Deque
        deque.addFirst("John");
        deque.addFirst("Jane");
        deque.addFirst("Alice");

        // Adding elements to the end of the Deque
        deque.addLast("Bob");
        deque.addLast("Mike");

        // Printing the Deque
        System.out.println("Deque: " + deque);

        // Accessing the front and end elements of the Deque
        String front = deque.peekFirst();
        String end = deque.peekLast();
        System.out.println("Front element: " + front);
        System.out.println("End element: " + end);

        // Removing elements from the front and end of the Deque
        String removedFront = deque.pollFirst();
        String removedEnd = deque.pollLast();
        System.out.println("Removed front element: " + removedFront);
        System.out.println("Removed end element: " + removedEnd);
        System.out.println("Deque after removal: " + deque);

        // Adding elements to the front and end of the Deque using the offerFirst() and offerLast() methods
        deque.offerFirst("Mark");
        deque.offerLast("Lily");
        System.out.println("Deque after offer: " + deque);

        // Checking if an element exists in the Deque
        boolean containsJane = deque.contains("Jane");
        System.out.println("Contains Jane? " + containsJane);

        // Checking the size of the Deque
        int size = deque.size();
        System.out.println("Size of the Deque: " + size);

        // Iterating over the elements in the Deque
        System.out.println("Iterating over the Deque:");
        for (String element : deque) {
            System.out.println(element);
        }

        // Clearing the Deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);
    }
}
