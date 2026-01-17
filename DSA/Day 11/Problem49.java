// 11.  
// A 
// A B 
// A B C

public class Problem49{
    public static void main(String[] args){
        for(int i=0; i<=2; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)('A' + j) + " ");
            }
            System.err.println();
        }
    }
}