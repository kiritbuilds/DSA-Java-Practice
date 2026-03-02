// Sort array of 0s, 1s, and 2s (Dutch Flag)
// import java.util.*;

// public class Problem157 {
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 2, 0, 1, 2};
//         Arrays.sort(arr);
//         for(int i=0 ; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

public class Problem157 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        
        // Ginti rakhne ke liye 3 dabbe
        int count0 = 0, count1 = 0, count2 = 0;

        // Step 1: Poore array mein ghoom kar ginti karo
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // Step 2: Array ko naye sire se bhar do (Overwrite)
        int index = 0; // Array mein kahan khade hain, uski position
        
        // Pehle saare 0 daal do
        for (int i = 0; i < count0; i++) {
            arr[index] = 0;
            index++; // Agli kursi par badho
        }
        
        // Phir saare 1 daal do
        for (int i = 0; i < count1; i++) {
            arr[index] = 1;
            index++;
        }
        
        // Aakhir mein saare 2 daal do
        for (int i = 0; i < count2; i++) {
            arr[index] = 2;
            index++;
        }

        // Print karke check karo
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
