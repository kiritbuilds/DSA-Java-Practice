// Counts Digits

// public class Problem103 {
//     public static void main(String[] args) {
//         int n = 1234;
//         int count = 0;
//         while(n>0){
//             count++;
//         n = n/10;
//         }        
//         System.out.println(count);
//     }
// }.

// Recursion
public class Problem103{
    static int Count(int n){
        if(n==0){
            return 0;
        }
        return 1 + Count(n/10);
    }
    public static void main(String[] args) {
        System.out.println(Count(1234));
    }
}


