// 7. Count digits in a number 

import java.util.Scanner;

public class Problem25{
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        System.out.println("Total Digit Is = " + count);
        sc.close();
    }
}