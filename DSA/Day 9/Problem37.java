// 19. Check leap year

import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        System.out.println("Enter Year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println("Leap Year Hai");
        }
        else if(year % 100 == 0 ){
            System.out.println("Not A Leap Year");
        }
        else if(year % 4 == 0){
            System.out.println("Leap Year Hai");
        }
        else{
            System.out.println("Not A Leap Year");
        }
        sc.close();
    }
}
