// Count Zeros

public class Problem116 {

    static int countZero(int n) {

        if(n == 0) return 0;     // base case

        int digit = n % 10;      // last digit

        if(digit == 0)
            return 1 + countZero(n / 10);
        else
            return countZero(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(countZero(102030040)); // Output: 5
    }
}