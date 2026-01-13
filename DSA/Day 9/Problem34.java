// 16. Power without using Math.pow()

import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base ");
        int a = sc.nextInt();
        System.out.println("Enter Power");
  
        int b = sc.nextInt();
        int result = 1;
        for(int i=1; i<=b; i++){
            result = result * a;
        }
        System.out.println("Result is: " + result);
        sc.close();        
    }
}
