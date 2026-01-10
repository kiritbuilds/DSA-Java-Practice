// 9. Check palindrome number

import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int Original = n;
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (Original == rev) {
            System.out.println("It Is Palindrome " + rev);
        }
        else{
            System.out.println("It Is Not A Palindrome");
        }
        sc.close();
    }
}
