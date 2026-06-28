// Q7. Search for an element
// Input: 1 → 2 → 3 → 4, search 3
// Output: Found at position 2
// Difficulty: 
// Companies: All companies

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

  public void search(int key){
    Node temp = head;
    int position = 0;

    while(temp != null){
        if(temp.data == key){
            System.out.println("Found at position " + position);
            return;
        }
        temp = temp.next;
        position++;
    }
    System.out.println("Not Found");
    }
}

public class Problem195 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.search(3);
    }
}