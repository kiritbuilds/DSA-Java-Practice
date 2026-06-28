// Q8. Find length of LinkedList
// Input: 1 → 2 → 3 → 4 → 5
// Output: 5
// Difficulty: 
// Companies: TCS, Infosys

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

   public int length(){
    Node temp = head;
    int count = 0;

    while(temp != null){
        count++;
        temp = temp.next;
    }
    return count;
}
}
public class Problem196 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println(l.length());
    }
}
