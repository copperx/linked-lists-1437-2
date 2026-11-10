// IntList: a linked list of ints that keeps its own first.
//
// On 10-28 every exercise had its own variable first, and any line in
// main could change it. Here first is private: only the methods of
// IntList can touch it. Code outside the class calls the methods.
//
//     list.first
//       |
//       v
//     [ 4 | next ]---->[ 8 | next ]---->[ 15 | null ]
//
// addFirst and toString are done in class together.
// You write size, contains, and addLast. Then run:
//
//     javac *.java
//     java IntListLab

public class IntList {
    private Node first;   // null means the list is empty

    // Done in class: insert at the head (10-28 Exercise 4).
    public void addFirst(int item) {
        first = new Node(item, first);
    }

    // Done in class: walk with current, add each item to a String.
    // The list 4 -> 8 -> 15 gives "4 -> 8 -> 15 -> null".
    // The empty list gives "null".
    public String toString() {
        String s = "";
        Node current = first;
        while (current != null) {
            s = s + current.item + " -> ";
            current = current.next;
        }
        return s + "null";
    }

    // Part 1: return how many items are in the list (10-28 Exercise 8).
    // The empty list has size 0.
    public int size() {
        int count = 0;
        Node current = first;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Part 2: return true if target is somewhere in the list, else false.
    // Walk with current. Return true as soon as you find it.
    public boolean contains(int target) {
        // TODO
        return false;
    }

    // Part 3: put item at the end of the list (10-28 Exercise 9).
    // Careful: if the list is empty, there is no last Node.
    // Then the new Node is the first Node.
    public void addLast(int item) {
        // TODO
    }

    // Challenge: remove the first item and return it.
    // If the list is empty, return -1 and change nothing.
    public int removeFirst() {
        // TODO
        return 0;
    }
}