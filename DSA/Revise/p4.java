// Baki Rahela

// import java.util.*;

// public class p4{
//     public static void main(String[] args){
//         int reverse = 0;
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         while(n>0){
//             int digit = n % 10;
//             reverse = reverse*10 + digit;
//             n = n / 10;
//         }
//         System.out.println(" Reverse Number Is A "+ reverse);
//         sc.close();
//     }
// }

// Complexity O(logn) Space O(1) declaration ek j hovathi T(n) n/10 ke n/2 hoy etle logn

// Check palindrome number

// import java.util.*;

// public class p4{
//     public static void main(String[] args){
//         int reverse = 0;
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int original = n;
//         while(n>0){
//             int digit = n % 10;
//             reverse = reverse*10 + digit;
//             n = n / 10;
//         }
//         if(original==reverse){
//             System.out.println("It is A Palindrome");
//         }else{
//             System.out.println("Not Palindrome");
//         }
//         sc.close();
//     }
// }

// 10. Find factorial 

// import java.util.Scanner;

// public class p4{
//     public static void main(String[] args) {
//         int factorial = 1;
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n; i>=1; i--){
//             factorial = factorial*i;
//         }
//         System.out.println(factorial);
//         sc.close();
//     }
// }

// Sum of Digits

// import java.util.Scanner;

// public class p4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         while (n>0) {
//             int digit = n%10;
//             sum = sum + digit;
//             n = n/10;
//         }
//         System.out.println(sum);
//         sc.close();
//         }
//     }

// 13. Prime number check 

// import java.util.*;

// public class p4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean isPrime = true;

//         if (n <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i < n; i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime) {
//             System.out.println("Prime");
//         } else {
//             System.out.println("Not Prime");
//         }
//         sc.close();
//     }
// }

// 14. Print all primes till N

// import java.util.Scanner;

// public class p4 {
//     public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

//         for (int num = 2; num <= n; num++) {

//             boolean isPrime = true;

//             for (int i = 2; i < num; i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }

//             if (isPrime) {
//                 System.out.print(num + " ");
//             }
//         }

//         sc.close();
//     }
// }

// 15. Fibonacci series till N

// import java.util.Scanner;

// public class p4{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int a = 0;
//         int b = 1;
        
//         System.out.print(a + " " + b + " ");
//         for(int i=3; i<=n; i++){
//             int c = a+b;
//             System.out.print(c +" ");

//             a=b;
//             b=c;
//         }
//         sc.close();
//     }
// }

// 16. Power without using Math.pow()

// import java.util.Scanner;

// public class p4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int base = sc.nextInt();
//         int power = sc.nextInt();
//         int result = 1;
//         for(int i=1; i<=power; i++){
//             result = result*base;
//         }
//         System.out.println(result);
//         sc.close();
//     }
// }

// 17. Count number of vowels in input 

// import java.util.Scanner;

// public class p4{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         int count = 0;

//         for(int i=0; i<str.length(); i++){

//             char ch = str.charAt(i);

//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
//                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//                 count++;
//             }
//         }

//         System.out.println("Vowels = " + count);

//         sc.close();
//     }
// }

// 18. Find largest of 3 numbers 

// import java.util.Scanner;

// public class p4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if(a>=b && a>=c){
//             System.out.println("A Is a Largest");
//         }else if(b>=c && b>=a){
//             System.out.println("B Is A Largest");
//         }else{
//             System.out.println("C is a Largest");
//         }
//         sc.close();
//     }
// }

// Check leap year

// import java.util.Scanner;

// public class p4{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();

//         if(year%400==0){
//             System.out.println("Leap Year");
//         }else if(year%100==0){
//             System.out.println("Not a Leap Year");
//         }else if(year%4==0){
//             System.out.println("Leap Year");
//         }else{
//             System.out.println("Not a Leap Year");
//         }
//         sc.close();
//     }
// }

// 20. Print ASCII values A–Z 

// public class p4 {
//     public static void main(String[] args) {
//         for(char ch='A'; ch<='Z'; ch++){
//             System.out.println(ch + "=" +(int)ch);
//         }
//     }
// }

