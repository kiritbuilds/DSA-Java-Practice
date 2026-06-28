// Q13. Print LinkedList in reverse (without reversing)
// Input: 1 → 2 → 3
// Output: 3 2 1
// Difficulty: 
// Companies: TCS, Wipro
// Hint: Use recursion or stack

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

    public void printReverse(Node node) {
        if (node == null) {
            return;
        }

        printReverse(node.next);
        System.out.print(node.data + " ");
    }
}
public class Problem201 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        l.printReverse(l.head);
    }
}