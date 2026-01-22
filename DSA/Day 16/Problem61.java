import java.util.Scanner;

public class Problem61 {
    public static void main(String[] args) {
        System.out.println("Enter Size Of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i ;

        System.out.println("Enter " + n + " number");
        // Take Input 
        for(i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
         int min = arr[0];

        // Check Minimum Elements
        for( i=1; i<arr.length; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element of Array Is " + min);
        sc.close();
    }
}
