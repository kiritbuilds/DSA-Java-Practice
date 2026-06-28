class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        next=null;
    }
}

class LinkedList{
    Node head = null;
    public void add(int data){
        Node current = head;
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
        }
        while (current!=null) {
            current = newnode;
        }
        


    }
}
public class Problem189{
    public static void main(String[]args){

    }
}