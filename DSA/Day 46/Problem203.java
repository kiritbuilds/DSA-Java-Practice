// Q15. Remove duplicates from sorted LinkedList
// Input: 1 → 1 → 2 → 3 → 3
// Output: 1 → 2 → 3
// Difficulty: 
// Companies: TCS, Infosys, TatvaSoft

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

    public void removeDuplicates(){
        Node current = head;

        while(current!=null && current.next!=null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
    }
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
public class Problem203 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(3);

        l.removeDuplicates();
        l.printValues();


    }
}
