// Factorial

// Normal Version
// import java.util.Scanner;

// public class Problem99{
//     public static void main(String[] args){
//         System.out.println("Enter Factorial Number ");
//         int result = 1;
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=2; i<=a; i++){
//             result = result * i;
//         }
//         System.out.println(result);
//         sc.close();
//     }
// }

// Recursive Version

public class Problem99{
    static int Factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n * Factorial(n-1);
    }
    }
    public static void main(String[] args) {
        System.out.println(Factorial(10));
    }
}
