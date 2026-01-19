// 15. 
//     *
//    * *
//   * * *
//    * *
//     *

public class Problem53{
    public static void main(String[] args) {
        int n = 3;

        // Higher
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower
        for(int i=2; i>=1; i--){
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }
            for(int j=2; j>=1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}