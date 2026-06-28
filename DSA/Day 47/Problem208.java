// Q20. Add two numbers represented as LinkedLists
// Input: L1 = 2 → 4 → 3 (represents 342)
// L2 = 5 → 6 → 4 (represents 465)
// Output: 7 → 0 → 8 (represents 807)
// Difficulty: 
// Companies: TatvaSoft, e-Infochips

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Problem208 {

    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node temp = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int val1;
            int val2;

            // if-else instead of ternary
            if (l1 != null) {
                val1 = l1.data;
            } else {
                val1 = 0;
            }

            if (l2 != null) {
                val2 = l2.data;
            } else {
                val2 = 0;
            }

            int sum = val1 + val2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            temp.next = new Node(digit);
            temp = temp.next;

            // move pointers
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummy.next;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // L1: 2 → 4 → 3
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // L2: 5 → 6 → 4
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = addTwoNumbers(l1, l2);

        print(result);
    }
}