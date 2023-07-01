import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the Stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Printing the Stack
        System.out.println("Stack: " + stack);

        // Accessing the top element of the Stack
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Popping elements from the Stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Checking if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // Checking the size of the Stack
        int size = stack.size();
        System.out.println("Size of the Stack: " + size);

        // Searching for an element in the Stack
        int position = stack.search("Java");
        System.out.println("Position of Java: " + position);

        // Iterating over the elements in the Stack
        System.out.println("Iterating over the Stack:");
        for (String element : stack) {
            System.out.println(element);
        }

        // Clearing the Stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}
