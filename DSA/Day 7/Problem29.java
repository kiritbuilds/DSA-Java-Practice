// 11. Count even & odd digits

import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        while (n > 0) {
            int digit = n % 10;

            if(digit % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            n = n / 10;
        }
        System.out.println("Even Number is " + evenCount);
        System.out.println("Odd Number is " + oddCount);
        sc.close();
    }
}
