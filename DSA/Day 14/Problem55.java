// 17. Inverted pyramid
// 1 2 3 4
//  1 2 3
//   1 2
//    1


public class Problem55 {
    public static void main(String[] args) {
        int rows = 4;
        for(int i=rows; i>=1; i--){
            for(int s=1; s<=rows-i; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
