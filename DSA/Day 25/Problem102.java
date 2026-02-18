// Power Of Number

// Normal Version
// import java.util.Scanner;

// public class Problem102{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Power ");
//         int n = sc.nextInt();
//         System.out.println("Enter Number or Root");
//         int m = sc.nextInt();
//         double k = Math.pow(m,n);
//         System.out.println(m + " ^ " + n + " = " + k);
//         sc.close();
//     }
// }

// Recursive Version
public class Problem102{
    static int power(int m, int n){
        if(n==0){
            return 1;
        }
        // Recursive Case
        return m * power(m,n-1);
}
    public static void main(String[] args) {
        int m = 2;
        int n = 5;
        
        System.out.println(power(m,n));
        // Output: 32
    }
}
