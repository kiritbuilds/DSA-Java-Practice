import java.util.Scanner;
public class Problem59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        //Take input
        System.out.println("Enter " + n + " Number");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Print Array
        System.out.println("Array Elements");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
