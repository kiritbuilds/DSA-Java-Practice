// Q10. Reverse a LinkedList (Recursive)
// Input: 1 → 2 → 3 → 4
// Output: 4 → 3 → 2 → 1
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

public Node reverse(Node head){

    if(head == null || head.next == null){
        return head;
    }

    Node newHead = reverse(head.next);

    head.next.next = head;
    head.next = null;

    return newHead;
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


public class Problem198 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        // l.reverse(Node head);

        l.printValues();
    }
}
