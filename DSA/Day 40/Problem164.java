// Q20. Leaders in array (greater than all right)
// Input: arr[] = {16, 17, 4, 3, 5, 2}
// Output: {17, 5, 2}
// Difficulty: 
// ⭐⭐
// Companies: TCS, Infosys

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // Step 1: Ek khali ArrayList banao jisme hum leaders ko ikattha karenge
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        // Agar array khali hai, toh khali list return kar do
        if (n == 0) return result;
        
        // Step 2: Sabse aakhri building hamesha Leader hoti hai
        int maxRight = arr[n - 1]; // Piche se pehla High Score
        result.add(maxRight); // Isko list mein daal do
        
        // Step 3: Ulta loop chalao (Second last building se lekar 0 tak)
        for (int i = n - 2; i >= 0; i--) {
            
            // Kya current building ab tak ke 'maxRight' se BADI ya BARABAR hai?
            if (arr[i] >= maxRight) {
                
                maxRight = arr[i]; // Naya High Score (Leader) update karo
                result.add(maxRight); // Is naye Leader ko list mein daal do
            }
        }
        
        // Step 4: List mein abhi [2, 5, 17] hai. GFG ko [17, 5, 2] chahiye.
        // Toh list ko ekdum se palat (reverse) do!
        Collections.reverse(result);
        
        // Aakhir mein list wapas bhej do
        return result;
    }
}