// Q17. Delete Nth node from end
// Input: 1 → 2 → 3 → 4 → 5, N = 2
// Output: 1 → 2 → 3 → 5
// Difficulty: 
// Companies: e-Infochips, Simform

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

    public void deleteNthFromEnd(int n) {
        Node first = head;
        Node second = head;

        // Step 1: move first n+1 steps
        for (int i = 0; i <= n; i++) {
            if (first == null) {
                head = head.next; // delete head case
                return;
            }
            first = first.next;
        }

        // Step 2: move both
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Step 3: delete
        second.next = second.next.next;
    }
    public void printValues(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Problem205 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        l.deleteNthFromEnd(2);
        l.printValues();
        
    }
}
