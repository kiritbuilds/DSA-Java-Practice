// Q6. Delete node with given key
// Input: 1 → 2 → 3 → 4, delete 3
// Output: 1 → 2 → 4
// Difficulty: 
// ⭐
// Companies: TatvaSoft, e-Infochips

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

    public void delete(int key) {

        // Head Null Hoy to Return
        if (head == null) {
            return;
        }

        // Head J Key Hoy to skip karvu
        if (head.data == key) {
            head = head.next;
            return;
        }

        // Middle ke last ma hoy tyare

        Node current = head;

        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

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

public class Problem194 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        l1.delete(2);
        l1.printValues();
    }
}
