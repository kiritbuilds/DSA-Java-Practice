// Q12. Detect loop/cycle in LinkedList
// Input: 1 → 2 → 3 → 4 → 2 (cycle)
// Output: true
// Difficulty: 
// Companies: TatvaSoft, e-Infochips, Simform
// IMPORTANT: Floyd's Cycle Detection

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

    public boolean Detect() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
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

public class Problem200 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(2);

        // 🔥 Cycle create kar rahe hai manually
        Node temp = l.head;

        Node second = temp.next; // 2nd node

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = second; // last node -> 2nd node (cycle)

        // Detect cycle
        System.out.println("Cycle Present: " + l.Detect());

    }
}
