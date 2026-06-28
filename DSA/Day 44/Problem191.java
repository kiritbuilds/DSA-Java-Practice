// // Q2. Insert at end
// // Input: 1 → 2 → 3, insert 4
// // Output: 1 → 2 → 3 → 4
// // Difficulty: 
// // Companies: All companies

// class Node{
//     int data;
//     Node next;
    
//     public Node(int data){
//         this.data=data;
//         next = null;
//     }
// }

// class LinkedList{
//     Node head = null;

//     public void add(int data){
//         Node newNode = new Node(data);

//         if(head==null){
//             head = newNode;
//             return;
//         }

//         Node current = head;

//         while(current.next!=null){
//             current = current.next;
//         }
//         current.next = newNode;
//     }

//     public void printList(){
//         Node temp = head;

//         while (temp!=null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }

// public class Problem191 {
//     public static void main(String[] args) {
//         LinkedList l = new LinkedList();
//         l.add(1);
//         l.add(2);
//         l.add(3);
//         l.add(4);

//         l.printList();

//     }
// }
