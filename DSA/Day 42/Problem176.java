import java.util.Scanner;

public class Problem176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int num = 2; num<=N; num++){
            boolean isPrime = true;
        for(int i=2; i<=num-1; i++){
            if(num%2==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print(num + " ");
        }
    }
    sc.close();
}
}
