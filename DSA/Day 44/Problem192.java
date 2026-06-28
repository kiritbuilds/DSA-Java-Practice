// // Q3. Insert at specific position
// // Input: 1 → 2 → 4, insert 3 at position 2
// // Output: 1 → 2 → 3 → 4
// // Difficulty: 
// // Companies: TCS, TatvaSoft

// class Node{
//     int data;
//     Node next;

//     public Node(int data){
//         this.data = data;
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

//         while (current.next!=null) {
//             current = current.next;
//         }
//         current.next = newNode;
//     }

//     public void addSpecific(int index, int data){
//         Node newNode = new Node(data);
//     }


//     public void printList(){
//         Node temp = head;

//         while(temp!=null){
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("null");
//     }
// }

// public class Problem192 {
//     public static void main(String[] args) {
//         LinkedList l = new LinkedList();
//         l.add(1);
//         l.add(2);
//         l.add(4);

//         l.printList();
//     }
// }
