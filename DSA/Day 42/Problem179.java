import java.util.Scanner;

public class Problem179 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.toLowerCase().charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
