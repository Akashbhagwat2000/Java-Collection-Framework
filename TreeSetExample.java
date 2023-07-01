import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        Set<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);

        // Printing the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Checking if an element exists in the TreeSet
        System.out.println("Contains 3? " + treeSet.contains(3));

        // Removing an element from the TreeSet
        treeSet.remove(5);
        System.out.println("TreeSet after removal: " + treeSet);

        // Checking the size of the TreeSet
        System.out.println("Size of the TreeSet: " + treeSet.size());

        // Iterating over the elements in the TreeSet
        System.out.println("Iterating over the TreeSet:");
        for (Integer number : treeSet) {
            System.out.println(number);
        }

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}
