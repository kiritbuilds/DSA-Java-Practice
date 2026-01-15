// 6.  
//     * 
//    * * 
//   * * * 
//  * * * *

public class Problem44{
    public static void main(String[] args) {
        int rows = 4;
        for(int i=1; i<=rows; i++){
            for(int s=1; s<=rows-i; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }        
    }
}