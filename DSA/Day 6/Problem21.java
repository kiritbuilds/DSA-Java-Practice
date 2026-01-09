// 3. 1 se N tak sum nikalo 

// import java.util.Scanner;

// public class Problem21 {
//     public static void main(String[] args) {
//         System.out.println("Enter Number:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=1; i<=n; i++){
//             sum = sum + i;
//         }
//         System.out.println("1 to N Number Sum Is " + "= " + sum);
//         sc.close();
//     }
// }

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("1 to N Number Sum Is " + "= " + sum);
        sc.close();
    }
}
