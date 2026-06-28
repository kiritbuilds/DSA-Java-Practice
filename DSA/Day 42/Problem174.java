public class Problem174 {
    public static void main(String[] args) {

        int n = 1221;

        //  Negative & last digit 0 case
        if (n < 0 || (n % 10 == 0 && n != 0)) {
            System.out.println("Not Palindrome");
            return;
        }

        int rev = 0;

        while (n > rev) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (n == rev || n == rev / 10) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}