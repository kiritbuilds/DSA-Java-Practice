// Leaders in array (greter than all right)

public class Problem159 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        // Step 1: Aakhri element hamesha Leader hota hai
        int highScore = arr[n - 1]; 
        System.out.print(highScore + " "); // Sabse pehle usko print kar diya (2)

        // Step 2: Ulta loop chalao (Second last element se lekar 0 tak)
        for (int i = n - 2; i >= 0; i--) {
            
            // Step 3: Agar current number High Score se BADA hai
            if (arr[i] > highScore) {
                
                // Toh woh Leader hai! Usko print karo
                System.out.print(arr[i] + " ");
                
                // Aur naya High Score set kar do
                highScore = arr[i]; 
            }
        }
    }
}
