// Q14. Check if LinkedList is palindrome
// Input: 1 → 2 → 3 → 2 → 1
// Output: true
// Difficulty: 
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

    public void Palindrome() {
        if (head == null || head.next == null) {
            System.out.println("Palindrome");
            return;
        }

        Node slow = head;
        Node fast = head;

        // Step 1: find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: reverse second half
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 3: compare
        Node first = head;
        Node second = prev;

        while (second != null) {
            if (first.data != second.data) {
                System.out.println("Not Palindrome");
                return;
            }
            first = first.next;
            second = second.next;
        }

        System.out.println("Palindrome");
    }
}

public class Problem202 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(2);
        l.add(1);

        l.Palindrome();
    }
}
