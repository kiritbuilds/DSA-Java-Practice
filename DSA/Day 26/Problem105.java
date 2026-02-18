// Reverse Number

// Normal Version
// public class Problem105{
//     public static void main(String[] args) {
//         int n = 1234;
//         int rev = 0;
//         while(n>0){
//             int digits = n%10;
//             rev = rev *10 + digits;
//             n = n / 10;
//         }
//         System.out.println(rev);
//     }
// }

// Revursive Version
public class Problem105 {

    // Helper function to count digits
    static int countDigits(int n) {
        if(n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    // Reverse number recursively
    static int reverse(int n) {
        if(n < 10) {
            return n; // base case (only 1 digit left)
        }

        int digits = countDigits(n / 10); 
        int last = n % 10;

        return last * (int)Math.pow(10, digits) + reverse(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}