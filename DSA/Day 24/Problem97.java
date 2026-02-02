// Recursion
// Print 1 to N

// Normal Version
// import java.util.Scanner;

// public class Problem97{
//     public static void main(String[] args) {
//         System.out.println("Enter Number: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             System.out.println(i);
//         }
//         sc.close();
//     }
// }

// Recursive Version

public class Problem97 {

    static void printNumbers(int n) {
        if(n == 0) {
            return; // base case
        }

        printNumbers(n - 1); // recursive call
        System.out.print(n + " "); // work
    }

    public static void main(String[] args) {

        int n = 5; // Example
        printNumbers(n) ; // calling recursive function
    }
}
