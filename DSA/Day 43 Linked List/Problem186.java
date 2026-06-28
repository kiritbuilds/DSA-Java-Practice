public class Problem186 {
    public static void main(String[] args){
        MyLinkedList nums = new MyLinkedList();

        nums.addFirst(5);
        nums.addFirst(3);
        nums.addFirst(7);

        nums.printValues();
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList{
    Node head;

    // addFirst Method
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printValues(){
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    
    System.out.println("null");
  }
}