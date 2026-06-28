// 1. 1 se 10 tak numbers print karo
// public class p1{
//     public static void main(String[] args){
//         for(int i=1; i<=10; i++){
//             System.out.print(i +" ");
//         }
//     }
// }

//2. 10 se 1 tak reverse print 

// public class p1{
//     public static void main(String[] args){
//         for(int i=10; i>=1; i--){
//             System.out.print(i +" ");
//         }
//     }
// }

//3. 1 se N tak sum nikalo
// import java.util.Scanner;

// public class p1{
//     public static void main(String[] args){
        // System.out.println("Enter");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

//         int sum = 0;
//         for(int i=1; i<=n; i++){
//             sum = i + sum;
//         }
//         System.out.print(sum +" ");
//         sc.close();
//     }
// }

// Time Complexity Is O(n) because n ke sath loop badh rhi hai 
//Reduce Karva Mate 1+2+3+...+n=n(n+1)/2
// Anathi aani complexity O(1) thay jashe kemke loop ni jarur nahin pade


// 4. Even numbers till N

// import java.util.Scanner;

// public class p1{
//     public static void main(String[] args){
//         System.out.println("Enter");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             if(i%2==0){
//                 System.out.print(i + " ");
//             }
//         }
//         sc.close();
//     }
// }


// // Time O(n) Space O(1)

//reduce karva mate
// for(int i=2; i<=n; i+=2){
//     System.out.print(i+ " ");
// }

// Iteration n/2 Thay gaya addha etle O(n/2) thay pan big Oh Constant Ne Ignore Kare etle O(n) thay Space O(1) j reshe declaration constant che

// 5. Odd numbers till N

// import java.util.Scanner;

// public class p1{
//     public static void main(String[] args){
        // System.out.println("Enter");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
//         for(int i=1; i<=n; i+=2){
//                 System.out.print(i + " ");
//         }
//         sc.close();
//     }
// }
// Iteration n/2 Thay gaya addha etle O(n/2) thay pan big Oh Constant Ne Ignore Kare etle O(n) thay Space O(1) j reshe declaration constant che


// 6. Table of a number

// import java.util.Scanner;

// public class p1{
//     public static void main(String[] args){
//         int n = 6;
//          System.out.println("Enter");
//         Scanner sc = new Scanner(System.in);
//         for(int i=1; i<=10; i++){
//             System.out.println(n + " X " + i + " = " + n*i);
//         }
//         sc.close();
//     }
// }

// Time Complexity O(10) fixed number hai 10 bar loop chalega and O(1) constant remove Space Complexity O(1) because memory ek bar hi use ho rhi hai...


