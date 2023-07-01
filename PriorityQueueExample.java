import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(1);

        // Printing the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Accessing the head element of the PriorityQueue
        int head = priorityQueue.peek();
        System.out.println("Head element: " + head);

        // Removing the head element from the PriorityQueue
        int removedElement = priorityQueue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("PriorityQueue after removal: " + priorityQueue);

        // Adding elements to the PriorityQueue using the offer() method
        priorityQueue.offer(2);
        System.out.println("PriorityQueue after offer: " + priorityQueue);

        // Checking if an element exists in the PriorityQueue
        boolean contains8 = priorityQueue.contains(8);
        System.out.println("Contains 8? " + contains8);

        // Checking the size of the PriorityQueue
        int size = priorityQueue.size();
        System.out.println("Size of the PriorityQueue: " + size);

        // Iterating over the elements in the PriorityQueue
        System.out.println("Iterating over the PriorityQueue:");
        for (int element : priorityQueue) {
            System.out.println(element);
        }

        // Clearing the PriorityQueue
        priorityQueue.clear();
        System.out.println("PriorityQueue after clearing: " + priorityQueue);
    }
}
