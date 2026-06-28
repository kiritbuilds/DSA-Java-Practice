import java.util.Scanner;

public class Problem178 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter root");
        int a = sc.nextInt();

        System.out.println("Enter Power");
        int b = sc.nextInt();

        int result = 1;

        for(int i = 1; i <= b; i++){
            result = result * a;
        }

        System.out.println(result);

        sc.close();
    }
}