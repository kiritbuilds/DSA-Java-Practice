// Q19. Find intersection point of two LinkedLists
// Input: 
// L1 = 1 → 2 → 3 ↘
// 7 → 8 → 9
// L2 = 4 → 5 → 6 ↗
// Output: Node with value 7
// Difficulty: 
// Companies: e-Infochips, Simform

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Problem207 {

    // Function to find intersection
    public static Node getIntersection(Node head1, Node head2) {
        Node p1 = head1;
        Node p2 = head2;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = head2;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = head1;
            } else {
                p2 = p2.next;
            }
        }

        return p1; // intersection node OR null
    }

    public static void main(String[] args) {

        // 🔹 Common part (intersection)
        Node common = new Node(7);
        common.next = new Node(8);
        common.next.next = new Node(9);

        // 🔹 L1: 1 → 2 → 3 → 7 → 8 → 9
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = common;

        // 🔹 L2: 4 → 5 → 6 → 7 → 8 → 9
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);
        head2.next.next.next = common;

        //  Find intersection
        Node result = getIntersection(head1, head2);

        if (result != null) {
            System.out.println("Intersection at node: " + result.data);
        } else {
            System.out.println("No intersection");
        }
    }
}