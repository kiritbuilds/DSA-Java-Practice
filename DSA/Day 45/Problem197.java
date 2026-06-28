// Q9. Reverse a LinkedList (Iterative)
// Input: 1 → 2 → 3 → 4 → 5
// Output: 5 → 4 → 3 → 2 → 1
// Difficulty: 
// Companies: TatvaSoft, e-Infochips, Simform
// MOST IMPORTANT: 90% interviews me aata hai!

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

}

class LinkedList {
    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
}

    public void reverse() {

        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next; // step 1
            current.next = prev; // step 2
            prev = current; // step 3
            current = next; // step 4
    }
        head = prev;
}

    public void printValues() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Problem197 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.reverse();

        l.printValues();
    }
}
