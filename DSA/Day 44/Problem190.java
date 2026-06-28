// Q1. Create a LinkedList & Insert at beginning
// Input: Insert 5 → Insert 3 → Insert 7
// Output: 7 → 3 → 5
// Difficulty: 
// Companies: TCS, Infosys, Wipro
// MUST KNOW: Basic structure!

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next = null;
    }
}

class LinkedList{
    Node head = null;

    public void add(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
public class Problem190 {
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();
        l.add(5);
        l.add(3);
        l.add(7);

        l.printList();
    }
}
