// 14. Print all primes till N

import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int num = 2; num <= N; num++) {

            boolean isPrime = true;

            for(int i = 2; i <= num - 1; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(num + " It Is A Prime Number");
            }else{
                System.out.println(num + " It is Not A Prime Number");
            }
        }

        sc.close();
    }
}
