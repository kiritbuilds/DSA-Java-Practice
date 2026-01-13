// 15. Fibonacci series till N 
import java.util.Scanner;
public class Problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = 0;
        int b = 1;

        while (a<=N) {
            System.out.print(a + " ");
            
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
