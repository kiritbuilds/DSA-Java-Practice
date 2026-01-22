import java.util.Scanner;

public class Problem63 {
    public static void main(String[] args) {
        System.out.println("Enter Siz Of Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        int i;

        System.out.println("Enter Input Of Array ");
        // Take Input
        for(i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array Is A " + sum);
        double Avg = sum / arr.length;
        System.out.println("Average Of Array Is A " + Avg);
        sc.close();
    }
}
