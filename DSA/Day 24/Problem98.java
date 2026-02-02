// Recursion
// Print N to 1

// Normal Version
// import java.util.Scanner;

// public class Problem98{
//     public static void main(String[] args) {
//         System.out.println("Enter Number: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n; i>=1; i--){
//             System.out.print(i + " ");
//         }
//         sc.close();
//     }
// }

// Recursive Version

public class Problem98 {

    static void printNumbers(int n) {
        if(n == 0) {
            return; // base case
        }

        System.out.print(n + " "); // work
        printNumbers(n - 1); // recursive call
    }

    public static void main(String[] args) {

        int n = 5; // Example
        printNumbers(n) ; // calling recursive function
    }
}
