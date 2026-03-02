// Q19. Find peak element
// Input: arr[] = {1, 3, 20, 4, 1, 0}
// Output: 20 (or index 2)

public class Problem158 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int n = arr.length;

        // Edge case 1: Agar array mein sirf 1 hi element ho, toh wahi akela peak hai
        if (n == 1) {
            System.out.println("Peak is: " + arr[0]);
            return;
        }
        
        // Edge case 2: Kya pehla element (index 0) apne right wale se bada hai?
        if (arr[0] >= arr[1]) {
            System.out.println("Peak is: " + arr[0]);
            return;
        }
        
        // Edge case 3: Kya aakhri element apne left wale se bada hai?
        if (arr[n - 1] >= arr[n - 2]) {
            System.out.println("Peak is: " + arr[n - 1]);
            return;
        }

        // Asli Loop (Beech ke elements ke liye: Index 1 se Index n-2 tak)
        for (int i = 1; i < n - 1; i++) {
            
            // YAHAN CONDITION BHARO: Kya arr[i] apne pichle (i-1) aur agle (i+1) dono se bada hai?
            if ( arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                System.out.println("Peak is: " + arr[i]);
                return; // Ek peak milte hi loop band kar do
            }
        }
    }
}