// String 
// 1. Input & Print String.
import java.util.Scanner;

public class Problem78{
    public static void main(String[] args){
        System.out.println("Enter Name ");
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        System.out.println("The Name Of Student Is A " + ch);
        sc.close();
    }
}