// Fibonacci Series

// Normal Version
// public class Problem101 {
//     public static void main(String[] args) {
//         int n = 5;
//         int a = 0;
//         int b = 1;
//         System.out.println("Fibonacci Series: ");
//         while(a<=n){
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//       }
//    }
// }

// Recursive Version
public class Problem101 {
    static int Fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    static void PrintSeries(int n){
        if(n<0){
            return;
        }
        PrintSeries(n-1);
        System.out.print(Fibonacci(n) + " ") ;

    }
        public static void main(String[] args) {
            int n = 7;
            PrintSeries(n);       
    }
}