import java.util.Scanner;

public class Problem177 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int a = 0;
         int b = 1;
         while(a<=n){
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;
         }
         sc.close();
    }
}
