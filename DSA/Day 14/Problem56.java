// 18. Butterfly Pattern
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

public class Problem56 {
    public static void main(String[] args) {
        int n = 4;
        // uper mate
        for(int i=1; i<=n; i++){
            for(int L=1; L<=i; L++){
                System.out.print("*");
            }
            for(int s=1; s<=2*(n-i); s++){
                System.out.print(" ");
            }
            for(int R=1; R<=i; R++){
                System.out.print("*");
            }
            System.out.println();
        }        

        // Lower Mate
        for(int i=n; i>=1; i--){
            for(int L=i; L>=1; L--){
                System.out.print("*");
            }
            for(int s=1; s<=2*(n-i); s++){
                System.out.print(" ");
            }
            for(int R=i; R>=1; R--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
