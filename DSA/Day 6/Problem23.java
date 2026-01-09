// 5. Odd numbers till N

import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<=num; i+=2){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
