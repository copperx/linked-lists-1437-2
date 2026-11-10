public class LinkedList {
    Node first;

    public void addFirst(int item) {
        first = new Node(item, first);
    }

    public int size() {
        int count = 0;

        Node current = first;
        while(current != null) {
            count++;
            current = current.next;    
        }
        return count;
    }

    public void print() {
        Node current = first;
        while(current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }
}