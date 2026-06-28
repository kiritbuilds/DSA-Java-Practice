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

//     // Delete First Node
//     // public void delete(int data){
//     //     if(head==null){
//     //         return;
//     //     }
//     //     head = head.next;
//     // }

//     // Delete Last
//     // public void deleteLast(){
//     //     if(head==null){
//     //         return;
//     //     }

//     //     if(head.next == null){
//     //         head = null;
//     //         return;
//     //     }else{
//     //         Node current = head;
//     //         while(current.next.next!=null){
//     //             current = current.next;
//     //         }
//     //         current.next = null;
//     //     }
//     // }

//     public void printValues(){
//         Node temp = head;

//         while(temp!=null){
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("null");
//     }
// }

// public class Problem193 {
//     public static void main(String[] args){
//         LinkedList l1 = new LinkedList();
//         l1.add(1);
//         l1.add(2);
//         l1.add(3);

//         // l1.deleteLast();
//         l1.printValues();
//     }
// }
