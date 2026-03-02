public class Problem155 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Kitni baar rotate karna hai
        
        // Outer Loop: Yeh kaam 'k' baar repeat karo
        for (int j = 0; j < k; j++) {
            
            // --- Yahan se sirf 1 baar Left Rotate ka logic hai ---
            
            int pehlaDabba = arr[0]; // Step 1: Pehle element ko safe kiya
            
            // Step 2: Baki sabko ek-ek kadam aage khiskao
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1]; 
            }
            
            // Step 3: Safe wale element ko aakhri mein daal diya
            arr[arr.length - 1] = pehlaDabba;
            
            // ---------------------------------------------------
        }

        // Final array print karo
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}