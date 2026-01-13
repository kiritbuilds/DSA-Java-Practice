// 13. Prime number check 

import java.util.Scanner;

public class Problem31{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("Not Prime");
        }

        boolean isPrime = true;

        for(int i = 2; i<=n-1; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Prime Number" );
        }else{
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}