// Q18. Merge two sorted LinkedLists
// Input: L1 = 1 → 3 → 5, L2 = 2 → 4 → 6
// Output: 1 → 2 → 3 → 4 → 5 → 6
// Difficulty: 
// Companies: TatvaSoft, e-Infochips
// IMPORTANT: Common interview question!

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Problem206 {

    // Merge function
    public static Node merge(Node l1, Node l2){
        Node dummy = new Node(0);
        Node temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        // remaining nodes
        if(l1 != null){
            temp.next = l1;
        } else {
            temp.next = l2;
        }

        return dummy.next;
    }

    // Print function
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){

        // L1: 1 → 3 → 5
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // L2: 2 → 4 → 6
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        Node result = merge(l1, l2);

        print(result);
    }
}