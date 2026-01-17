// 12.  
// A 
// B C 
// D E F


public class Problem50 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=0; i<=2; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)('A' + count) + " ");
                count++;
            }
            System.out.println();
        }
    }
}
