// public class Problem187{
//     public static void main(String[] args){
      
		
// 		Linkedlist nums = new Linkedlist();
	
// 		nums.add(5);
// 		nums.add(9);
		
// 		nums.add(6);
//         nums.addLast(4);
// 		nums.printValues();
		
// 	}

// }


// class nNode
// {
// 	int data;
// 	nNode next;
	
// 	public nNode(int data)
// 	{
// 		this.data = data;
// 		next = null;
// 	}
// }


// class Linkedlist
// {
// 	nNode head = null;
	
// 	public void add(int data)
// 	{
// 		nNode newNode = new nNode(data);
		
// 		nNode current = head;
// 		if(head == null)
// 			head = newNode;
// 		else {
// 			while(current.next != null)
// 				current = current.next;
// 			current.next = newNode;
// 		}	
// 	}
	
// 	public void printValues() 
// 	{
// 		nNode current = head;
		
// 		while(current != null)
// 		{
// 			System.out.print(current.data + " ");
// 			current = current.next;
// 		}
// 		System.out.println();
// 	}
//     public void addLast(int data) {
//     nNode newNode = new nNode(data); // Naya dabba ban gaya
    
//     // Agar train ekdum khali hai, toh yahi pehla dabba ban jayega
//     if (head == null) {
//         head = newNode;
//         return; 
//     }
    
//     // Agar train mein dabbe hain, toh engine (head) se shuru karo
//     nNode current = head;
    
//     // Chalte jao jab tak aakhri dabba na aaye
//     while (current.next != null) {
//         current = current.next; // Agle dabbe par kudo
//     }
    
//     // Aakhri dabba mil gaya! Ab iski zanjeer se naye dabbe ko jod do
//     current.next = newNode;
// }	
// }