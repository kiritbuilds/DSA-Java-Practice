// Sum Of N Numbers

// Normal Version
// import java.util.Scanner;

// public class Problem100 {
//     public static void main(String[] args) {
//         int sum = 0;
//         int i;
//         System.out.println("Enter Number ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(i=1; i<=n; i++){
//             sum = sum + i;        
//         }
//         System.out.println("Sum OF N Number IS A " + sum);
//         sc.close();
//     }
// }

// Recursive Version

import java.util.Scanner;

public class Problem100{
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n + Sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
        sc.close();
    }
}
