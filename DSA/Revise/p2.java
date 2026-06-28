// 7. Count digits in a number 

// import java.util.Scanner;

// public class p2{
//     public static void main(String[] args){
//          System.out.println("Enter");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count = 0;
//         while(n>0) {
//                 n = n/10;
//                 count++;
//         }
//         System.out.println(count + " ");
//         sc.close();
//     }
// }

// 8. Reverse a number 

// import java.util.Scanner;

// public class p2{
//     public static void main(String[] args){
//          System.out.println("Enter");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n; i>=1; i--){
//             System.out.print(n +");
//         }
//         sc.close();
//     }
// }

// 9. Check palindrome number

// import java.util.Scanner;

// public class p2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             if(i==)
//         }
//     }
// }

// 10. Find factorial 

// import java.util.Scanner;

// public class p2{
//     public static void main(String[] args) {
//         System.out.println("Enter number");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         long factorial = 1;
//         for(int i=n; i>=1; i--){
//             factorial = factorial * i;
//         }
//         System.out.println(factorial);
//         sc.close();
//         }
// }

// T O(n) S O(1)

// 11. Count even & odd digits

// import java.util.Scanner;

// public class p2 {
//     public static void main(String[] args) {
// System.out.println("Enter number");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
//         int evenCount = 0;
//         int oddCount = 0;
//         while (n > 0) {
//             int digit = n % 10;

//             if (digit % 2 == 0) {
//                 evenCount++;
//             } else {
//                 oddCount++;
//             }

//             n = n / 10;
//         }
//         System.out.println("Even Count is: " + evenCount + " Odd Count is: " + oddCount);
//         sc.close();
//     }
// }

// 12. Sum of digits 

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}