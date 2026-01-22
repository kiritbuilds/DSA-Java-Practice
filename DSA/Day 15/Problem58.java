
// 1. Input & print array
import java.util.Scanner;

public class Problem58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size Of Array");

        int n = sc.nextInt();

        // Create Array
        int[] arr = new int[n];
        int i;

        System.out.println("Enter " + n + " Input");
        // Taking Input
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print Arrays
        System.out.println("Array Elements:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}