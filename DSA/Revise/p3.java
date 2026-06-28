// 1.  
// ***** 

// public class p3 {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++){
//             System.out.print("*" + " ");
//         }
//     }
// }

// 2.  
// * 
// * 
// * 
// * 
// *

// public class p3 {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++){
//             System.out.println("*");
//         }
//     }
// }
 
// 3.  
// * * * * 
// * * * * 
// * * * * 

// public class p3 {
//     public static void main(String[] args) {
//         for(int i=1; i<=3; i++){
//             for(int j=1; j<=4; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
 
// 4.  
// * 
// * * 
// * * * 
// * * * * 

// public class p3 {
//     public static void main(String[] args) {
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 5.  
// * * * * 
// * * * 
// * * 
// * 

// public class p3 {
//     public static void main(String[] args) {
//         for(int i=4; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

// 6.  
//    * 
//   * * 
//  * * * 
// * * * * 

// public class p3 {
//     public static void main(String[] args) {
//         for(int i=4; i>=1; i--){
//             for(int j=1; j<=i-1; j++){
//                 System.out.print(" ");
//             }
//             System.out.print(" * ");
//             System.out.println();
//         }
//     }
// }

// 7.  
// * 
// * * 
// * * * 
// * * 
// * 

// public class p3 {
//     public static void main(String[] args) {
//         for(int i=1; i<=3; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//             }
//         for(int i=2; i>=1; i--){
//              for(int j=1; j<=i; j++){
//                 System.out.print("*");
//         }
//          System.out.println();
//     }
// }
// }

// 9.  
// 1 
// 1 2 
// 1 2 3 

// public class p3{
//     public static void main(String[] args) {
//         for(int i=1; i<=3; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 10.  
// 1 
// 2 3 
// 4 5 6 

// public class p3{
//     public static void main(String[] args) {
//         int num = 1;
//         for(int i=1; i<=3; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// 11.  
// A 
// A B 
// A B C

// public class p3{
//     public static void main(String[] args) {
//         for(int i=1; i<=3; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print((char)('A' + j - 1) + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 1. Input & print array 
// public class p3{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }

// TC = O(n)
// SC = O(1)

// 2. Find max element 

public class p3{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<=arr[i]){
                max = arr[i];
                arr[i] = arr[i+1]; 
            }
        }
        System.out.println("Maximum Element IS A: " + max);
    }
}