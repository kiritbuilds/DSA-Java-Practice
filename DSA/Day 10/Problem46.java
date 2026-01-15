// 8.  
//     * * * * 
//       * * *  
//         * * 
//           * 

public class Problem46 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 4; i>= 1; i--) {
            for(int s=0; s<=rows-i; s++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
